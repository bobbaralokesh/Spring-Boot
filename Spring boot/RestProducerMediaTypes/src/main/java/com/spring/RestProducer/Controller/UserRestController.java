package com.spring.RestProducer.Controller;

import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RestProducer.Entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/Get")
	public ResponseEntity<User> getOneObj() {
		User ob=new User(1,"Lokesh","8787878",
				Set.of("qwe","dded"),
				      Map.of("abc","bcn") ,"Password@123"  );
		ResponseEntity<User> response=new ResponseEntity<>(ob,HttpStatus.OK);
		
		return response;
	}
}
