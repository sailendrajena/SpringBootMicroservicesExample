package com.spring.junit.test.api.responseClasses;

import lombok.Data;

@Data
public class BookResponse {
	private String name;
	private String author;
	private Double price;
}
