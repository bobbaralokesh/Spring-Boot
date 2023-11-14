package com.spring.ManyToMany.TestRunnerForInsertion;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.ManyToMany.Entity.Course;
import com.spring.ManyToMany.Entity.Student;
import com.spring.ManyToMany.Repository.CourseRepo;
import com.spring.ManyToMany.Repository.Studentrepo;



@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private Studentrepo su;
	
	@Autowired
	private CourseRepo cr;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
          
	Course c=new Course(10,"Java","10000");
	Course c1=new Course(11,"Python","20000");
	Course c2=new Course(12,"Dev","30000");
	Course c3=new Course(13,"Boot","40000");
	Course c4=new Course(14,"SPring","50000");
	
	 cr.saveAll(Arrays.asList(c,c1,c2,c3,c4));
	 
	 Student s=new Student(1,"lokesh","djkjkds",Arrays.asList(c,c1));
	 Student s1=new Student(2,"PO","djkjkds",Arrays.asList(c2,c3,c4));
	 
	 su.saveAll(Arrays.asList(s,s1));
	
	}

}
