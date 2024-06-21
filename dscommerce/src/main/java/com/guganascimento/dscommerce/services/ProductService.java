package com.guganascimento.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guganascimento.dscommerce.dto.ProductDTO;
import com.guganascimento.dscommerce.entities.Product;
import com.guganascimento.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	@Autowired
	public ProductService(ProductRepository repository) {
	    this.repository = repository;
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product product = repository.findById(id).get();
		return new ProductDTO(product);		
	}

}
