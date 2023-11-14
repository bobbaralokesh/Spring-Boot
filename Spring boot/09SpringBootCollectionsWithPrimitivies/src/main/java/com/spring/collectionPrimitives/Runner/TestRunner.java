package com.spring.collectionPrimitives.Runner;

import java.util.Arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.collectionPrimitives.Entity.Product;
import com.spring.collectionPrimitives.repository.ProductRepo;

@Component
public class TestRunner implements CommandLineRunner {

@Autowired	
private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		Product pr=new Product();
		pr.setProdId(112);
		pr.setProdCode("Pen");
		pr.setColours(Arrays.asList("Blue","Green","Black"));
		
		Set<String> se = new LinkedHashSet<>();
		
		se.add("Mobile");
		se.add("Phones");
		se.add("Cam");
		
		pr.setModel(se);
		
		Map<String, String> mp=new LinkedHashMap<>();
		
		
		mp.put("cam", "mobiles");
		mp.put("watches", "Wrist");
		pr.setDetail(mp);
		
		repo.save(pr);
	}

}
