package com.spring.h2.core.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.h2.core.api.exception.UserException;
import com.spring.h2.core.api.model.Users;

@Repository
public class UsersRepoImpl {
	
	@Autowired
	private UsersRepository userRepo;
	
	public Users getUserById(long id) {
		return userRepo.findById(id).orElseThrow(()->new UserException("User not found with this id: "+id));
	}
	
	public void createUser(Users user) {
		userRepo.save(user);
	}
	
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}
}
