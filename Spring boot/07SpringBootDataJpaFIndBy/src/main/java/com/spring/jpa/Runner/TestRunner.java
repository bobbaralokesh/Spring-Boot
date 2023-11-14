package com.spring.jpa.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Book;
import com.spring.jpa.Repo.BookRepository;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(
		 Arrays.asList(
				 new Book(101,"Lokesh","Bobbara",200.0,"Human"),
				 new Book(101,"Praveen","Dasari",300.0,"Human"),
				 new Book(101,"Niranjan","Charity",000.0,"Human"),
				 new Book(101,"Chai","Lenka",2100.0,"Human"),
				 new Book(101,"Sree","Sri",2100.0,"Human"))
		 );
		
		repo.findByAuthor("Lokesh").forEach(System.out::println);
	}

}
