package com.spring.oauth.api.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to Spring SSO Google Authentication integration with Spring Boot Application";
	}
	
	@GetMapping
	public Principal users(Principal principal) {
		System.out.println("Username: "+principal.getName());
		return principal;
	}
}
