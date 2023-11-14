package com.spring.NonSelectQuries.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor    
@Entity
@Table(name="Pod_Tab")
public class Product {

	@Id
	@Column(name="Pro_Id")
	private Integer id;
	
	@Column(	
			name="Pro_Name",
			unique = true,
			updatable = false,
			nullable = false,
			length = 50,
			insertable = true)
	private String prodName;
	
	@Column(name="Pro_Cost")
	private String prodCost;
	
}
