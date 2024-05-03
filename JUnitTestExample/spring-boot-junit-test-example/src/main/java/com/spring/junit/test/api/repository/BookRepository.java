package com.spring.junit.test.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.junit.test.api.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	public Book findBookByName(String name);
}
