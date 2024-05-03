package com.spring.resttemplate.core.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.resttemplate.core.api.model.School;
import com.spring.resttemplate.core.api.services.SchoolService;

@RestController
@RequestMapping("/api/school/v1/")
public class SchoolController {
	
	@Autowired
	private SchoolService service;
	
	@GetMapping("allschools")
	public List<School> getAllSchools(){
		return service.getAllSchools();
	}
	
	@GetMapping("fetch/{id}")
	public ResponseEntity<School> getUserById(@PathVariable("id") Long schoolId){
		School sch = service.getSchool(schoolId);
		return ResponseEntity.ok(sch);
	}
	
	@PostMapping("create")
	public ResponseEntity<School> saveSchool(@RequestBody School school){
		School sch = service.saveSchool(school);
		return new ResponseEntity<School>(sch, HttpStatus.CREATED);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteSchool(@PathVariable("id") Long schoolId) {
		return service.deleteSchool(schoolId);
	}
}
