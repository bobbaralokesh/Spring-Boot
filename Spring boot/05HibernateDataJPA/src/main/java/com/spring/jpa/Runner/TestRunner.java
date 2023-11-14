package com.spring.jpa.Runner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.Entity.Employee;
import com.spring.jpa.Exception.ProductNotFoundException;
import com.spring.jpa.Repo.EmpRepository;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmpRepository emp;
	
	@Autowired
	private Employee em;
	
	@Override
	public void run(String... args) throws Exception {
	    
		/*
		 * em.setAge("26"); em.setName("Praveen"); em.setDepartment("Java"); //TO insert
		 * the data // emp.save(em);
		 * 
		 * // emp.saveAll(Arrays.asList(em)); //This method takes multiple objects at a
		 * time as a collection type and performs same operations // like save() method.
		 * 
		 * // To fetch the data
		 * 
		 * Iterable<Employee> fetch= emp.findAll();
		 * 
		 * // for each loop for (Employee employee : fetch) { System.out.println(fetch);
		 * }
		 * 
		 * 
		 * //for each lamda Expression fetch.forEach(od -> System.out.println(od));
		 * System.out.println("Inserted"); //It will check given row is present in table
		 * or not is present give true if row is not there it will return false
		 * emp.existsById(2); System.out.println(emp);
		 */
	 
	   Employee emm= emp.findById(1)
	    .orElseThrow(
	    		()-> new ProductNotFoundException("NOT EXIST")
	    		);
	   System.out.println(emp);
	}

}
