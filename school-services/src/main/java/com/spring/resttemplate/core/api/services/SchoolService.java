package com.spring.resttemplate.core.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.resttemplate.core.api.model.School;

@Service
public interface SchoolService {
	
	List<School> getAllSchools();
	School saveSchool(School school);
	School getSchool(Long schoolId);
	String deleteSchool(Long schoolId);
}
