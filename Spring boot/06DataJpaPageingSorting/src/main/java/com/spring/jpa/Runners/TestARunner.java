package com.spring.jpa.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Product;
import com.spring.jpa.Repository.ProductRepo;

//@Component
public class TestARunner implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {

		
		  //Select * from product order by productname ASC 
		Iterable<Product> pr  =repo.findAll(Sort.by("Product_Price").descending()); for(Product product :
		  pr) { System.out.println(pr); //for each iteration }
		  
		  
		  
		  System.out.println("*********************");
		  
		  Iterable<Product> list = repo.findAll(); list.forEach(System.out::println);
		  
		  System.out.println("++++++++++++++++");
		  //Select * from product order by model ASC
		  Iterable<Product> list1 = repo.findAll(Sort.by("model")); //
		  list1.forEach(System.out::println); // method Reference Iteration
		  
		  System.out.println("++++++++++++++++");
		  
		  
		  //select * from product order by model DESC //Use Direction property in by()
		   // repo.findAll(Sort.by(Direction.ASC, "productName"))
		  repo.findAll(Sort.by(Direction.DESC, "productName")).forEach(System.out::println);
		 

		// select * from product order by productname, model;    both ASC
		 // select * from product order by productname DESC ,model DESC both DESC 
		  	System.out.println("***********");
		repo.findAll(Sort.by(Direction.DESC, "productName", "model")).forEach(System.out::println);
		
		   
	//	select * from product order by productName asc, model DESC
		System.out.println("One*******************************************************");
		repo.findAll(Sort.by(Order.asc("productName"),Order.desc("model"))).forEach(System.out::println);

	}

}
}

