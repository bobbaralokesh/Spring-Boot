package com.spring.collectionPrimitives.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.collectionPrimitives.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
