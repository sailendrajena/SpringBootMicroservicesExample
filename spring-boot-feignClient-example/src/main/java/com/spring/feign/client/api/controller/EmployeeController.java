package com.spring.feign.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.client.api.responseEntity.EmployeeResponse;
import com.spring.feign.client.api.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("employee/{id}")
	private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
		EmployeeResponse response = service.getEmployeeById(id);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}