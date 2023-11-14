package com.spring.ManyToOne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ManyToOne.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	

}
