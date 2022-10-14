package com.mphasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.entity.Book;
import com.mphasis.service.BookService;

@RestController
@RequestMapping(path="/books")
public class BookController {
	
 @Autowired
 private BookService bookservice;
 
 	@PostMapping(value="books")
	public Book storeBook(Book book) {
	 	return bookservice.save(book);
	}
 	
 	@PutMapping(value="books")
	public Book updateBook(Book book) {
	 	return bookservice.update(book);
	}
 	
 	
 	@GetMapping(value="/getAllBooks", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public List<Book> getAllBooks() {
	 	return bookservice.getAllBooks();
	}
 	
 	@GetMapping(value="/{id}") 
	public Book getBookById(@PathVariable int id) {
	 	return bookservice.getBooksById(id);
	}
 	
 	@GetMapping(value="title/{title}", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Book getBookByTitle(@PathVariable String title) {
	 	return bookservice.getBooksByTitle(title);
	}
 	
 	@DeleteMapping(value="/{id}")
 	public void deleteById(@PathVariable int id) {
 		 bookservice.delete(id);
 	}
 	
 	@GetMapping(value="publisher/{publisher}", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Book getBookByPublisher(@PathVariable  String publisher) {
	 	return bookservice.getBooksByPublisher(publisher);
	}
 	@GetMapping(value="year/{year}", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Book getBookByYear(@PathVariable String year) {
	 	return bookservice.getBooksByYear(year);
	}
 
}
