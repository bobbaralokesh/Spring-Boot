package com.spring.ManyToOne.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ManyToOne.Entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
