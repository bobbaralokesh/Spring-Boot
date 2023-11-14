package com.spring.ManyToMany.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="stu_tab")
public class Student {

	@Id
	@Column(name="Stu_Id")
	private Integer id;
	
	@Column(name="Stu_Name")
	private String Sname;
	
	@Column(name="Stu_Email")
	private String Email;
	
	@ManyToMany
	@JoinTable(name="CSNewFk_Table",
	joinColumns = @JoinColumn(name="SFK"),
	inverseJoinColumns = @JoinColumn(name="CFK"))
	private List<Course> cor;
}
