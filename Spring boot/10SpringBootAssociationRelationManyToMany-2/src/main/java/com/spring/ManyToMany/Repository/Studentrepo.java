package com.spring.ManyToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ManyToMany.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
