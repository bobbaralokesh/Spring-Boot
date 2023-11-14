package com.spring.jpa.Runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Book;
import com.spring.jpa.Repo.BookRepository;

@Component
public class FindByRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	
                repo.findByBookNameStartingWith("L").forEach(System.out::println);
                
                repo.findByBookCostLessThan(2000).forEach(System.out::println);
                
                
                System.out.println("******************************************************************************************");
              Optional<Book> op= repo.findByBookId(21);
              if(op.isPresent()) {
            	  System.out.println(op.get());
              }else {
            	  System.err.println("No Data FOund");
              }
	}

}
