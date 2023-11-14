package com.spring.Thymleaf.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Thymleaf.Bean.Book;



@Controller
@RequestMapping("/book")
public class BookController {

	//1. Dispaly book objetc and book collection at UI
	
	@GetMapping("/show")
	public String showbooks(Model model) {
		  
		Book b= new Book(12,"Book","someone",122.0);
		model.addAttribute("bob" ,b);
		return "BookData";
	}
	
	// 2. Display Book Collection at UI
	@GetMapping("/list")
	public String showbooksList(Model model) {
		List<Book> list=Arrays.asList(
				new Book(12,"java","oracle",1233.4),
		        new Book(12,"core","oracle",455.4),
		        new Book(12,"spring","oracle",78.4),
		        new Book(12,"java","oracle",7888.4));
		
		model.addAttribute( "list",list);
		
		return "ListOfBooks";
	}
}
