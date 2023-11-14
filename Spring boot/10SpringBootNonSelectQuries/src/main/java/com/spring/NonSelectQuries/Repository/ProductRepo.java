package com.spring.NonSelectQuries.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.NonSelectQuries.Entity.Product;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Transactional  // We need to use Transactional in service Layer (Here we USed because Service Layer is not yet Created)
	@Modifying
	@Query("UPDATE Product SET prodName=:Pn WHERE id=:pid")
	int UpdateNamesById(String Pn, Integer pid );
} 
