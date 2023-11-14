package com.spring.ThymleafEX.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ThymleafEX.Entity.Employee;
import com.spring.ThymleafEX.Repository.EmpRepository;
import com.spring.ThymleafEX.Service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmpRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		/*
		 * double hra=e.getEmpHra()* (12.0/100); double ta=e.getEmpTa() * (15.0/100);
		 * e.setEmpHra(hra); e.setEmpTa(ta)
		 */; 
		
	  e= repo.save(e);
		return e.getEmpid();
	}

	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);

	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Employee getOneEmployee(Integer id) {
	Optional<Employee> opt=	repo.findById(id);
		return opt.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
	      List<Employee> li= repo.findAll();
		return li;
	}

}
