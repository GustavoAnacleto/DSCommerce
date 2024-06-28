package com.guganascimento.dscommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guganascimento.dscommerce.dto.ProductDTO;
import com.guganascimento.dscommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductControler {

	@Autowired
	private ProductService service;
	
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		 return service.findById(id);
		
	}
	@GetMapping
	public Page<ProductDTO> findAll(Pageable pageable) {
		 return service.findAll(pageable);
		
	}

}
