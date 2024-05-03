package com.spring.resttemplate.core.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.resttemplate.core.api.exceptionHandler.SchoolNotFoundException;

@ControllerAdvice
public class SchoolExceptionController {
	
	@ExceptionHandler(value = SchoolNotFoundException.class)
	public ResponseEntity<Object> exception(SchoolNotFoundException exception){
		return new ResponseEntity<>("School not found", HttpStatus.NOT_FOUND);
	}
}
