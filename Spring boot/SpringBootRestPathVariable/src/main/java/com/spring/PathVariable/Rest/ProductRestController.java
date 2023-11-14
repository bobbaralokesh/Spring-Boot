package com.spring.PathVariable.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	//1. Using Request Param
	@GetMapping("/get")
	public ResponseEntity<String> ShowDataA(
			@RequestParam("pid") Integer id,
			@RequestParam("pname") String name) {
		ResponseEntity<String> response=new ResponseEntity<>("check at consloe",HttpStatus.OK);
		return response;
		
	}
	
	//2. Using Path Variable
	@GetMapping("/pget/{pid}/{pname}")
	public ResponseEntity<String> showdatab(
			@PathVariable("pid") Integer id,
			@PathVariable("pname") String name) {
		
		
		return new ResponseEntity<>("ChECK AT CONSOLE",HttpStatus.OK);
		
	}
}
