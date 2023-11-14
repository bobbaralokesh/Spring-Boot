package com.spring.Exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Exception.Entity.Product;
import com.spring.Exception.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProductbyId(
			@PathVariable Integer id) {
		ResponseEntity<Product> response =null;
		try {
			 Product p=service.getOneProductById(id);
			 response=new ResponseEntity<Product>(p,HttpStatus.OK);
		} catch (ProductNotFoundException pnfe) {
			pnfe.printStackTrace();
			throw pnfe;   //Call Handler
		}
		
	
		 return response;
		
		/*if(id==50) {
		return new ResponseEntity<>("Product",HttpStatus.OK);
		
	}else {
		throw new ProductNotFoundException("Product Not Found Exception" + "id");
	}
	}*/
}
}

