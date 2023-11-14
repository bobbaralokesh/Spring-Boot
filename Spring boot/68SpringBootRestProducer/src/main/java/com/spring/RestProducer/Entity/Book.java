package com.spring.RestProducer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Integer bid;
	private String bname;
	private String bauth;
	private Double bcost;
	
	
}
