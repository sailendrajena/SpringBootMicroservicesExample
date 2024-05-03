package com.spring.loadbalance.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbook-application/")
public class ChatbookController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("chat")
	public String chatNow() {
		return "Hi I am inside the ChatBook application.....Application is up on port: "+port;
	}
}
