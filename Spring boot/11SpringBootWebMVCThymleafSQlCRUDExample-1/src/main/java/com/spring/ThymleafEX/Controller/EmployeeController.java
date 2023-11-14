package com.spring.ThymleafEX.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ThymleafEX.Entity.Employee;
import com.spring.ThymleafEX.Service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	/*
	 * 1. Show Register Page This Method is Used to display Register page When End
	 * User Enters /Register with get type
	 */
	
      @GetMapping("/register")	
	  public String ShowRegPage() {
		  return "EmployeeRegister";
	  }
	 
	
	// 2. On Click Form Submit, Read Data (@ModelAttirbute)
	/**
	 * This method is used to read form data as model attribute
	 * It will make a call to the service method by passing same form object
	 * service method returns PK(ID)
	 * Controller returns string message back to UI using model
	 * @param employee
	 * @param model
	 * @return
	 */
      @PostMapping("/save")
      public String saveFormData(
    		  @ModelAttribute Employee employee, Model model) {
    	  
    	  Integer id=service.saveEmployee(employee);
    	  String message= new StringBuffer().append("Employee").append(id).append("Created").toString();
    	  model.addAttribute("message", message);     //if u have any data in  the controller if u have To send data to the UI we should use Model
    	  return "EmployeeRegister";
      }
      
	// 3. Display All Rows As  a table
	
      @GetMapping("/All")
       public String getAllEmps(Model model) {
    	     List<Employee> list= service.getAllEmployee();
    	   model.addAttribute("list", list);
    	   return "EmployeeData";
       }
      
	// 4. Delete Based On Id
	
	// 5. One Click Edit Link(Hyper link) Show data in Edit form
	
	// 6. Update Form Data And Submit
}
