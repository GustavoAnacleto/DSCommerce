package com.guganascimento.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guganascimento.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
