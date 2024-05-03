package com.spring.core.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.core.api.model.Tutorial;
import com.spring.core.api.repository.TutorialRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {
	
	@Autowired
	private TutorialRepository tutorialRepo;
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorial(@RequestParam(required = false) String title){
		List<Tutorial> tutorials = new ArrayList<>();
		
		try {
			if(title == null) {
				tutorialRepo.findAll().forEach(tutorials::add);
			}else {
				tutorialRepo.findByTitleContaining(title).forEach(tutorials::add);
			}
			
			if(tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
