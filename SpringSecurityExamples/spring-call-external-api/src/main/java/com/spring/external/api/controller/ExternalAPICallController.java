package com.spring.external.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/")
public class ExternalAPICallController {
	private static RestTemplate template = new RestTemplate();
	
	
	@GetMapping("hello")
	public String hello() {
		return "Hi Sailendra Narayan Jena calling from hello() method....";
	}
	
	@GetMapping("/callclienthello")
	public String callclienthello() {
		String url = "http://localhost:8080/api/v1/hello";
		String result = template.getForObject(url, String.class);
		return result;
	}
	
}
