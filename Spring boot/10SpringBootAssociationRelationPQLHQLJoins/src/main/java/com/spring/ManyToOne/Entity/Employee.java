package com.spring.ManyToOne.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Emp_Tab")
public class Employee {
 
	@Id
	@Column(name="Emp_Id")
	private Integer empId;
	
	@Column(name="Emp_Name")
	private String empName;
	
	@Column(name="Emp_Admin")
	private String empAdmin;
	
	@ManyToOne
	@JoinColumn(name="DPFK")
	private Department depo;
	
}
