package com.spring.feign.client.api.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.feign.client.api.entity.Employee;
import com.spring.feign.client.api.repository.EmployeeRepository;
import com.spring.feign.client.api.responseEntity.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	
	public EmployeeResponse getEmployeeById(int id) {
		Optional<Employee> emp = repo.findById(id);
		EmployeeResponse response = mapper.map(emp, EmployeeResponse.class);
		
		return response;
	}
}
