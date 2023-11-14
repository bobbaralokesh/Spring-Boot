package com.spring.jpa.Exception;

public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	public ProductNotFoundException() {
		super();
	}
	
public ProductNotFoundException(String message) {
		super(message);
	}
}
