package com.spring.client.server.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@Value("${message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
