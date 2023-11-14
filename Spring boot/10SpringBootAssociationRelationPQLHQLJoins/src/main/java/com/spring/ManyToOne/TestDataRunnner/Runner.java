package com.spring.ManyToOne.TestDataRunnner;

import java.util.Arrays;
import java.util.List;

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
		Department d1=new Department(873,"Bobbara","Python");
		Department d2=new Department(874,"Oracle","Orcl");
		
		deprepo.save(d);
		deprepo.save(d1);
		deprepo.save(d2);
		
		Employee em=new Employee(10,"Praveen","Java", d);
		Employee em1=new Employee(11,"Dasari","Java", d2);
		Employee em2=new Employee(12,"Niranjan","Java", d);
		
		emrepo.saveAll(Arrays.asList(em,em1,em2));
		
		List<Object[]> list1=emrepo.getNames();
		for(Object[] ob: list1) {
			System.out.println(ob[0]+"********Is Working************"+ ob[1]);
		}
		
		
		
		
	}

}
