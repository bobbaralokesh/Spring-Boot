package com.spring.ManyToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ManyToMany.Entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
