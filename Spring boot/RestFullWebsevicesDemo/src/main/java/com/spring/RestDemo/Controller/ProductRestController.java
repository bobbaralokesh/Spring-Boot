package com.spring.RestDemo.Controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	
	// 1. Fetch Resources
	@GetMapping("/fetch")
	public ResponseEntity<String> getProduct() {
		ResponseEntity<String> Response= new ResponseEntity<>("Get Method",HttpStatus.OK);
		
		return Response;
	}
	
	//2. Create Resource
	@PostMapping("/save")
	public ResponseEntity<String> CreateProduct(){
		ResponseEntity<String> response =new ResponseEntity<>("Create Method",HttpStatus.OK);
		return response;
	}
	
	//3. Modify Resource
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(){
		ResponseEntity<String> Response= new ResponseEntity<>("Update Method",HttpStatus.OK);
		return Response;
	}
	
	//4. Remove Resource
	@DeleteMapping("/delete")
	public ResponseEntity<String> DeleteProduct() {
		ResponseEntity<String> Respose =new ResponseEntity<>("Delete Method",HttpStatus.OK);
		return Respose;
	}
	
	@PatchMapping("/PartialUpdate")
	public ResponseEntity<String> ModifyProduct() {
		ResponseEntity<String> response=new ResponseEntity<>("Partial Update",HttpStatus.OK);
		return response;
		
	}
}
