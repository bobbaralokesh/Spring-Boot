package com.spring.ThymleafEX.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee_Table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Emp_Id")
	private Integer empid;
	
	@Column(name="Emp_Name")
	private String empName;
	
	@Column(name="Emp_Sal")
	private double empsal;
	
	@Column(name="Emp_Hra")
	private double empHra;
	
	@Column(name="Emp_Ta")
	private double empTa;
	
	@Column(name="Emp_Dep")
	private String empDep;
 	
	
}
