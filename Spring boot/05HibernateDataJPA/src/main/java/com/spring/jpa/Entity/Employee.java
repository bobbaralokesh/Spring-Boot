package com.spring.jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="Emp_Table")
@Component
public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Emp_id")
	private int id;
	@Column(name="Emp_Name")
	private String Name;
	@Column(name="Emp_Age")
	private String age;
	@Column(name="Emp_Depatment")
	private String Department;
}
