package com.spring.h2.core.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.h2.core.api.model.Users;
import com.spring.h2.core.api.repository.UsersRepoImpl;

@Service
public class UsersServices {
	
	@Autowired
	private UsersRepoImpl userImpl;
	
	public Users getUserById(long id) {
		return userImpl.getUserById(id);
	}
	
	public void createUsers(Users user) {
		userImpl.createUser(user);
	}
	
	public List<Users> getAllUsers(){
		return userImpl.getAllUsers();
	}
}
