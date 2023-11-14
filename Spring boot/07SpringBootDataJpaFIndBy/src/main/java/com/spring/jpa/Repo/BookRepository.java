package com.spring.jpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.Entity.Book;
import java.util.List;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Integer> {

	//select * from Book where Author=""
	List<Book> findByAuthor(String author);
	
	//select * from Book where bookname like %
	List<Book> findByBookNameStartingWith(String input);
	
	
	//select * from book where bookcost <= ?
	List<Book> findByBookCostLessThan (double input);
	
	Optional<Book> findByBookId(Integer bookId);
}
