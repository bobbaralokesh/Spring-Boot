package com.spring.OneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.OneToMany.Entity.Model;

public interface ModelRepo extends JpaRepository<Model, Integer> {

}
