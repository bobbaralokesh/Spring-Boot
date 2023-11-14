package com.spring.OneToMany.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Prod_Tab")
public class Product {

	@Id
	@Column(name="Prod_Id")
	private Integer id;
	
	@Column(name="Prod_Name")
	private String name;
	
	@Column(name="Prod_Type")
	private String type;
	
	
	@OneToMany
	@JoinColumn(name="MFK")
	private List<Model>  mo;
}
