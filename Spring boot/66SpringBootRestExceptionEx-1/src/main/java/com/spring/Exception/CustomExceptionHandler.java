package com.spring.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.Exception.Entity.MyCustomResponse;

@RestControllerAdvice
public class CustomExceptionHandler {

	/*@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> ShowCustomException(	ProductNotFoundException pnfe) {
	
		return new ResponseEntity<String>(pnfe.getMessage(),
	
				HttpStatus.INTERNAL_SERVER_ERROR);*/

@ExceptionHandler(ProductNotFoundException.class)	
public ResponseEntity<MyCustomResponse> MyException(ProductNotFoundException pnfe) {
	
	
	return new ResponseEntity<MyCustomResponse>(
			new MyCustomResponse(
					new Date().toString(),
					"Error",
					500,
					pnfe.getMessage()),
			HttpStatus.INTERNAL_SERVER_ERROR);
	
}
	
	}

