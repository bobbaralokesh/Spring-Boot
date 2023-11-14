package com.spring.Exception.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.Exception.ProductNotFoundException;
import com.spring.Exception.Entity.Product;

@Service
public class ProductService {

	
	public Product getOneProductById(Integer id) {
	
		if(id==150) {
			return new Product(id,"Dummy");
		}else {
			throw new ProductNotFoundException("Product '"+id+"' Does not Exist");
		}
		
		
	}
}
