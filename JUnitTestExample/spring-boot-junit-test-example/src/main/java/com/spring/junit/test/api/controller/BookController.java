package com.spring.junit.test.api.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.junit.test.api.entity.Book;
import com.spring.junit.test.api.responseClasses.BookResponse;
import com.spring.junit.test.api.services.BookService;

@RestController
@RequestMapping("/api/v1/")
public class BookController {

	@Autowired
	private BookService services;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("books")
	public List<BookResponse> getAllBooks(){
		return services.getAllBooks().stream().map(book->mapper.map(book, BookResponse.class)).toList();
	}
	
	@GetMapping("book/{id}")
	public ResponseEntity<BookResponse> getBookById(@PathVariable("id") Long id ) {
		Book bk = services.getBookById(id);
		
		BookResponse response = mapper.map(bk, BookResponse.class);
		
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("book/name/{name}")
	public ResponseEntity<BookResponse> findBookByName(@PathVariable("name") String name){
		Book bk = services.findBookByName(name);
		BookResponse response = mapper.map(bk, BookResponse.class);
		
		return ResponseEntity.ok().body(response);
	}
}
