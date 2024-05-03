package com.spring.junit.test.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.junit.test.api.entity.Book;
import com.spring.junit.test.api.exception.BookNotFoundException;
import com.spring.junit.test.api.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public List<Book> getAllBooks(){
		return repo.findAll();
	}
	
	public Book getBookById(Long id) {
		return repo.findById(id).orElseThrow(()->new BookNotFoundException("Book Not Found with id: "+id));
	}
	
	public Book findBookByName(String name) {
		return repo.findBookByName(name);
	}
}
