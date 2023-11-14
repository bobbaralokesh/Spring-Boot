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
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Products")
public class Product {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Product_Id")
	private Integer id;
    
    @Column(name="Product_Name")
	private String productName;
    
    @Column(name="Product_Price")
	private String price1;
    
    @Column(name="Model")
	private String model;
    
    @Column(name ="test")
    private String testing;
    
  
    
    
    
    
    
}
