package com.spring.resttemplate.core.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.resttemplate.core.api.exceptionHandler.SchoolNotFoundException;
import com.spring.resttemplate.core.api.model.School;
import com.spring.resttemplate.core.api.repository.SchoolRepository;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository repo;

	@Override
	public School saveSchool(School school) {
		return repo.save(school);
	}

	@Override
	public School getSchool(Long schoolId) {
		School sch = repo.findById(schoolId)
				.orElseThrow(() -> new SchoolNotFoundException("School not found with id: " + schoolId));
		return sch;
	}

	@Override
	public String deleteSchool(Long schoolId) {
		Optional<School> sch = repo.findById(schoolId);
		if (sch.isPresent()) {
			repo.deleteById(schoolId);
			return "School Deleted Successfully with id: " + schoolId;
		}
		return "School not found with this id: " + schoolId;
	}

	@Override
	public List<School> getAllSchools() {
		return repo.findAll();
	}
}