package com.spring.jwt.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {
	
	@GetMapping("message")
	public String message() {
		return "Welcome to Hello world program......";
	}
}
