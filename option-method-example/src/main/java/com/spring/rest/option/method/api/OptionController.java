package com.spring.rest.option.method.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080/api/v1/", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/")
public class OptionController {
	
	@GetMapping("message")
	public String getMessage() {
		return "This message from Sailendra Narayan Jena Spring Boot Test Example";
	}
}
