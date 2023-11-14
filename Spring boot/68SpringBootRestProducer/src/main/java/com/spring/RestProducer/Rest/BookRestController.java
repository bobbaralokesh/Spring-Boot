package com.spring.RestProducer.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RestProducer.Entity.Book;

@RestController
@RequestMapping("/vi/api/book")
public class BookRestController {

	@GetMapping("/show")
	public ResponseEntity<String> ShowMsg1() {
		return ResponseEntity.ok("Welcome");
		
	}
	
	@GetMapping("/show2/{id}/{name}")
	public ResponseEntity<String> ShowMsg2(
			@PathVariable("id") Integer id,
			@PathVariable("name") String name) {
		
		return ResponseEntity.ok("Welcome" + id +" "+ name);
		
	}
	
	@GetMapping("/show3")
	public ResponseEntity<Book> Showmsg3() {
		return ResponseEntity.ok(new Book(101,"abd","raj",500.0));
		
	}
	
	@PostMapping("/show4")
	public ResponseEntity<String> show4(
			@RequestBody Book book) {
		return ResponseEntity.ok("Data Is Given" + book);
		
	}
	
	
}
