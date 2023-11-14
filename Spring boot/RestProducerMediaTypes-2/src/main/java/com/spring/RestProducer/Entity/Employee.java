package com.spring.RestProducer.Entity;

import java.util.List;

import lombok.Data;

@Data
public class Employee {

	
	private Integer id;
	private String empName;
	private String empDep;
	private Address add;
	private List<String> str;
}
