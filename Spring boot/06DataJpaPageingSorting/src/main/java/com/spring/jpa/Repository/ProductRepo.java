package com.spring.jpa.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.jpa.Entity.Product;

public interface ProductRepo extends PagingAndSortingRepository<Product, Integer> {

}
