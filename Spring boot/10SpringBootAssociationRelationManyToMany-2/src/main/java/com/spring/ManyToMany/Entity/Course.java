package com.spring.ManyToMany.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="Cour_Tab")
public class Course {

	@Id
	@Column(name="Course_Id")
	private Integer id;
	
	@Column(name="Course_Name")
	private String courseName;
	
	@Column(name="Course_Fee")
	private String courseFee;
}
