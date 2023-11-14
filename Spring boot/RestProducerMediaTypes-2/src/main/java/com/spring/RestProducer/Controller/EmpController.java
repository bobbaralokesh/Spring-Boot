package com.spring.RestProducer.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RestProducer.Entity.Employee;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@PostMapping("/create")
	public ResponseEntity<String> CreateEmp(
			@RequestBody Employee emp) {
		String s= emp.toString();
		ResponseEntity<String> Response=new ResponseEntity<>(s,HttpStatus.OK);
		return Response;
		
	}
}
