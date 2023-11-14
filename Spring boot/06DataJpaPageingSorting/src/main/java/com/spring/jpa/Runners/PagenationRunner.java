package com.spring.jpa.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Product;
import com.spring.jpa.Repository.ProductRepo;
@Component
public class PagenationRunner implements CommandLineRunner {

	@Autowired
	private ProductRepo pro;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Input
         Pageable pr=PageRequest.of(0, 3);
         
         //Output
         Page<Product> po=pro.findAll(pr);
         
         //Result
         po.getContent().forEach(System.out::println);
         
         
         //Metadaata
         
         System.out.println(po.isEmpty());
         System.out.println(po.getContent());
         System.out.println(po.isFirst());
         System.out.println(po.isLast());
         System.out.println(po.hasNext());
         System.out.println(po.hasPrevious());
         System.out.println(po.getTotalElements());
         System.out.println(po.getTotalPages());
         System.out.println(po.getSize());
	}

}
