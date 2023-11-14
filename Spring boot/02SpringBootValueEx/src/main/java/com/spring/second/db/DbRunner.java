package com.spring.second.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DbRunner implements CommandLineRunner {

	@Autowired
	  public DatabaseCon db;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(db);
	}

}
