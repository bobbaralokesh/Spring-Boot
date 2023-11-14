package com.spring.ThymleafEX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ThymleafEX.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
