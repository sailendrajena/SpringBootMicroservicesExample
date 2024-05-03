package com.spring.cb.core.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/v1/")
public class MovieController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("subscribes")
	@CircuitBreaker(name = "MOVIE_SERVICE", fallbackMethod = "subscribesFallbackMethod")
	public ResponseEntity<String> getSubscribes(){
		int numOfSubscribe = template.getForObject("http://localhost:8082/subscribe/subscribes", Integer.class);
		String response = "subscribes "+numOfSubscribe;
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	
	public ResponseEntity<String> subscribesFallbackMethod(Exception ex){
		return new ResponseEntity<String>("Subscribe service is down due to this reason: "+ex.getMessage(), HttpStatus.OK);
	}
}
