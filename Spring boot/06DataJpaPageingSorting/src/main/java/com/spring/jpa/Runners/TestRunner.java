package com.spring.jpa.Runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Product;
import com.spring.jpa.Repository.ProductRepo;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;  
	
	public void run(String... args) throws Exception {
	//Insert Into database	
     repo.saveAll(
    		 Arrays.asList(
    				 new Product(11, "mobile","10000","Samsung","LG"),
    				 new Product(11, "mobile","20000","Nokia","Moto"),
    				 new Product(11, "mobile","30000","Moto","Samsung"),
    				 new Product(11, "mobile","40000","Oneplus","Google"),
    				 new Product(11, "mobile","50000","Google","SONY")
    				 )
    		 );
		
    
     
    
     
	}

}
