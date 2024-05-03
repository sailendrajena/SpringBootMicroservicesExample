package com.spring.transaction.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.transaction.api.entity.Employee;
import com.spring.transaction.api.services.EmployeeServices;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices empService;
	
	@PostMapping("employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) throws Exception{
		Employee saveEmp = empService.addEmployee(emp);
		
		return new ResponseEntity<Employee>(saveEmp, HttpStatus.CREATED);
	}
}
