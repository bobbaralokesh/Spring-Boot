package com.spring.Model.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {

	// 1. To Dispaly HTML form Inside the browser
	
	@GetMapping("/show")                      
    public String displayForm() {
    		return "UserName";
    }
	
// 2. Read the data
	
}
