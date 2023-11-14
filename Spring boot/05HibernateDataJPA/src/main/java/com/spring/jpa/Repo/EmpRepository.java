package com.spring.jpa.Repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.Entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
