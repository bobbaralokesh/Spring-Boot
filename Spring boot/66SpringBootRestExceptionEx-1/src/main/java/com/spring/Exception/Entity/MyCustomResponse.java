package com.spring.Exception.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyCustomResponse {

	private String date;
	private String status;
	private int code;
	private String message;
	
}
