package com.spring.h2.core.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.h2.core.api.model.Users;
import com.spring.h2.core.api.services.UsersServices;

@RestController
@RequestMapping("/api/v1/")
public class UsersController {
	
	@Autowired
	private UsersServices services;
	
	@PostMapping("create")
	public void createUser(@RequestBody Users userDetails) {
		services.createUsers(userDetails);
	}
	
	@GetMapping("users")
	public List<Users> getAllUsers(){
		return services.getAllUsers();
	}
}
