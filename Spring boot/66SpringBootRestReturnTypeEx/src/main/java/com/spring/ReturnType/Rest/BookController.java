package com.spring.ReturnType.Rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ReturnType.Entity.Book;

@RestController
@RequestMapping("/Book")
public class BookController {

	@GetMapping("/obj/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		
		ResponseEntity<?> response=null;
		HttpHeaders headers=new HttpHeaders();
		headers.add("found", "Yes");
		if(id==500) {
			response=new ResponseEntity<Book>(
					new Book(1,"BVC",1000.0),    //body
					headers,                //head
					HttpStatus.OK);     //http Status
		}else {
			headers.add("Not Found", "No");
			response=new ResponseEntity<String>(
					"Sorry No Book Found",    //Body
					headers,               //Head
					HttpStatus.BAD_REQUEST);   //http Status
					
		}
		
		return response;
		
	}
	
}
