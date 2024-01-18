package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

// In Jpa Repository provides various methods like findAll(),getById() we can consume those from our interface
//Long: The second generic parameter indicates the type of the primary key of the entity (Product). 
public interface ProductRepository extends JpaRepository<Product, Long> {

}
