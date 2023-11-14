package com.spring.ManyToOne.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.ManyToOne.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	@Query("select emp.empName, dept.depName from  Employee emp INNER JOIN emp.depo as dept")
	List<Object[]> getNames();

}



