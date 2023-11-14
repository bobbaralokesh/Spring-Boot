package com.example.RestConsumer.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class TestRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		
		// 1. Create URL
		
		//String url="http://localhost:9090/vi/api/book/show";
		String url="http://localhost:9090/vi/api/book/show4";
		
		
		// 2. Create Request Header
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		//3. Create Request Body
		
		String body="{ \"id\":101, \"bname\":\"Raj\", \"bauth\":\"Raj\",  \"bcost\":500.0 }";
		//2 + 3 combine 2 and 3
		
		HttpEntity<String> requestEntity=new HttpEntity<>(body,header);
		//4. Create Rest template Object
		
		RestTemplate template= new RestTemplate();
		//5. Make HTTP Call And Get Response Back
		//ResponseEntity<String> response=template.getForEntity(url, String.class);
		
		//ResponseEntity<String> response=template.postForEntity(url, requestEntity, String.class);
		ResponseEntity<String> response=template.exchange(url, HttpMethod.POST,requestEntity, String.class);
		
		//6. Print Details
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getClass());

	}

}
