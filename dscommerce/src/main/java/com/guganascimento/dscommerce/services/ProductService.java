package com.guganascimento.dscommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guganascimento.dscommerce.dto.ProductDTO;
import com.guganascimento.dscommerce.entities.Product;
import com.guganascimento.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private final ProductRepository repository;
	public ProductService(ProductRepository repository) {
	    this.repository = repository;
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product product = repository.findById(id).get();
		return new ProductDTO(product);		
	}
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable){
		Page<Product> result = repository.findAll(pageable);
		return result.map(x-> new ProductDTO(x));
	}

}
