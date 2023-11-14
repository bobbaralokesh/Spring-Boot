package com.spring.ThymleafEX.Service;

import java.util.List;

import com.spring.ThymleafEX.Entity.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	 void updateEmployee(Employee e);
	 void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	List<Employee> getAllEmployee();
	
	
}
