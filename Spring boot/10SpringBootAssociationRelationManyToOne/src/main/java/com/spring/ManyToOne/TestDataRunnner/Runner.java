package com.spring.ManyToOne.TestDataRunnner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.ManyToOne.Entity.Department;
import com.spring.ManyToOne.Entity.Employee;
import com.spring.ManyToOne.Repo.DepartmentRepo;
import com.spring.ManyToOne.Repo.EmployeeRepo;

@Component
public class Runner implements CommandLineRunner {
 
	@Autowired
	private EmployeeRepo emrepo;
	
	@Autowired
	private DepartmentRepo deprepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
             
		Department d=new Department(872,"Lokesh","Java");
		
		deprepo.save(d);
	
		
		Employee em=new Employee(10,"Praveen","Java", d);
		Employee em1=new Employee(11,"Dasari","Java", d);
		Employee em2=new Employee(12,"Niranjan","Java", d);
		
		emrepo.saveAll(Arrays.asList(em,em1,em2));
		
		
		
		
		
		
	}

}
