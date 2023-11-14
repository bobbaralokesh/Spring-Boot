package com.spring.jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BookTable")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column(name="Book_Id")
	private Integer bookId;
	
	@Column(name="Book_Name")
	private String bookName;
	
	@Column(name="Author")
	private String author;
	
	@Column(name="Book_Cost")
	private Double bookCost;
	
	@Column(name="Book_Type")
	private String bookType;
	
}
