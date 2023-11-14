package com.example.RestConsumer.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestRunner2 implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		
		// 1. Create URL
		
		String url="http://localhost:9090/vi/api/book/show2/{id}/{name}";
		
		
		
		// 2. Create Request Header
		//3. Create Request Body
		//2 + 3 combine 2 and 3
		//4. Create Rest template Object
		
		RestTemplate template= new RestTemplate();
		//5. Make HTTP Call And Get Response Back
		//ResponseEntity<String> response=template.getForEntity(url,String.class,10,"Lokesh");

		ResponseEntity<String> response=template.exchange(url, HttpMethod.GET,null,String.class,10,"lokesh");

		
		//6. Print Details
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getClass());

	}

}
