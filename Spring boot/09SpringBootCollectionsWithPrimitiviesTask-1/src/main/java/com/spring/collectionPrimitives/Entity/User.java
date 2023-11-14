package com.spring.collectionPrimitives.Entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="UserTable")
public class User {
	
	@Id
	@Column(name="User_Id")
	private Integer uId;
	
	@Column(name="User_Name")
	private String uName;
	
	@ElementCollection
	@CollectionTable(name="Roles",
	       joinColumns = @JoinColumn(name="UFK"))
	@OrderColumn(name="UIC")
	@Column(name="Roles")
	List<String> roles;

}
