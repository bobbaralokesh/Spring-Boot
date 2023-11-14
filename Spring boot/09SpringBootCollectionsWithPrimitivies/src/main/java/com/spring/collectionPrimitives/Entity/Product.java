package com.spring.collectionPrimitives.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name="Prodtable")
public class Product {
			@Id
		    @Column(name="PId")
			private Integer prodId;
			
			@Column(name="pcode")
            private String prodCode;
			
			@ElementCollection
			@CollectionTable(name="Product_colours",            //list table name annotion 
			      joinColumns=@JoinColumn(name="pidfk")) //forgien key anotation      
			@OrderColumn(name="pos")   //index column for list
			@Column(name="Data") //element column
			private List<String> colours;
			
			@ElementCollection
			@CollectionTable(name="Product_Model",
			          joinColumns = @JoinColumn(name="pidFk"))  //list table name annotion 
			@Column(name="Models")
			private Set<String> model;    
			
			@ElementCollection
			@CollectionTable(name="Prodcut_details",
			               joinColumns = @JoinColumn(name="pidFk"))
			@MapKeyColumn(name="code")   //index column for map
			@Column(name="Details")
			private Map<String, String> detail;
		
 }
