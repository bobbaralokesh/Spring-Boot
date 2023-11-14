package com.spring.collectionPrimitives.Runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.collectionPrimitives.Entity.User;
import com.spring.collectionPrimitives.Repository.UserRepo;

@Component
public class TestRunner implements CommandLineRunner {
   
	@Autowired
	private UserRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u=new User();
		u.setUId(10);
		u.setUName("Developer");
		u.setRoles(Arrays.asList("Dev","QA","Admin"));
		
		repo.save(u);
	

	}

}
