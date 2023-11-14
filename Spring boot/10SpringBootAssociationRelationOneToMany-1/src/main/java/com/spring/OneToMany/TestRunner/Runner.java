package com.spring.OneToMany.TestRunner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.OneToMany.Entity.Model;
import com.spring.OneToMany.Entity.Product;
import com.spring.OneToMany.Repository.ModelRepo;
import com.spring.OneToMany.Repository.ProductRepo;

@Component
public class Runner implements CommandLineRunner {

@Autowired	
private	ModelRepo mrepo;

@Autowired
private ProductRepo prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
 
		Model m=new Model(1,"m2","XYZ-ABC");
		Model m1=new Model(1,"m3","XYZ-DCG");
		Model m2=new Model(1,"m4","XYZ-HGF");
		Model m3=new Model(1,"m5","XYZ-FFJ");
		
		mrepo.saveAll(Arrays.asList(m,m1,m2,m3));
		
		 Product pr =new Product(10,"MObiles","SmartPhone", Arrays.asList(m,m1) );
		 Product pr1 =new Product(11,"Watches","SmartWatches", Arrays.asList(m2,m3) );
		
		 //prepo.saveAll(Arrays.asList(pr,pr1));
	   prepo.save(pr);
	   prepo.save(pr1);
	}

}
