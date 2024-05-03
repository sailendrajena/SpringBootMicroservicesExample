package com.spring.junit.test.api.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.ResultActions;

import com.spring.junit.test.api.entity.Book;
import com.spring.junit.test.api.exception.BookNotFoundException;
import com.spring.junit.test.api.repository.BookRepository;

public class TestHandleExceptionAPI {
	
	@Autowired
	private BookService services;
	
	@MockBean
	private BookRepository repo;
	
	@Test
	public void assertThrowWithNoMessage() {
		List<Book> bk = new ArrayList<Book>();
		doReturn(bk).when(services).findBookByName("Java");
		
		BookNotFoundException bookNotFoundException = assertThrows(BookNotFoundException.class,
				() -> services.findBookByName("Java"));
		assertEquals("Book not found in Book Store!", bookNotFoundException.getMessage());
	}
}
