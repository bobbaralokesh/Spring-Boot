package com.spring.NonSelectQuries.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.NonSelectQuries.Entity.Product;
import com.spring.NonSelectQuries.Repository.ProductRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private ProductRepo prepo;
	
	
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
 
		prepo.save(new Product(1,"SmartPhone","200")); 
		
	System.out.println("Data Inserted");
System.out.println();
	int count=prepo.UpdateNamesById("Mobilessss", 1);
	System.out.println(count);
	
	}

}
