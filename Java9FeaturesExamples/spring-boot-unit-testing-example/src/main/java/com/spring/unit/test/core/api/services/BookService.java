package com.spring.unit.test.core.api.services;

import com.spring.unit.test.core.api.entity.Book;
import com.spring.unit.test.core.api.exceptions.BookNotFoundException;
import com.spring.unit.test.core.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> getAllBooks(){
        return repo.findAll();
    }


    public Book getBookById(int id){
        return repo.findById(id).orElseThrow(()->new BookNotFoundException("Book not found with this id: "+id));
    }

    public Book createNewBook(Book book){
        Book bk = repo.findById(book.getBookId()).orElseThrow(()->new BookNotFoundException("Book not found with this id: "+book.getBookId()));
        bk.setBookId(book.getBookId());
        bk.setTitle(book.getTitle());
        bk.setPublisher(book.getPublisher());
        return bk;
    }

}
