package com.chinasoft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinasoft.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
