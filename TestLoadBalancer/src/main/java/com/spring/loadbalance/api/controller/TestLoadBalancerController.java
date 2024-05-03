package com.spring.loadbalance.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestLoadBalancerController {
	
	@GetMapping
	public String testLoadBalancer(HttpServletRequest request) {
		System.out.println("Hi I am "+request.getRequestURL().toString());
		return request.getRequestURL().toString();
	}
}
