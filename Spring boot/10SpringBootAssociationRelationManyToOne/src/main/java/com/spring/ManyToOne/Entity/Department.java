package com.spring.ManyToOne.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Dep_Table")
public class Department {

	@Id
	@Column(name="dep_Id")
	private Integer depId;
	@Column(name="dep_Name")
	private String depName;
	@Column(name="dep_Admin")
	private String depAdmin;
}
