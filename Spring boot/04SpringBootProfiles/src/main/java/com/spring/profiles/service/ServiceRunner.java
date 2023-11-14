package com.spring.profiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("service")
public class ServiceRunner implements CommandLineRunner {

	@Autowired
	public Service sr;
	@Override
	public void run(String... args) throws Exception {
		sr.setAge("25");
		sr.setName("lokesh");
		sr.setNumber(1);
		
		System.out.println(sr);

	}

}
