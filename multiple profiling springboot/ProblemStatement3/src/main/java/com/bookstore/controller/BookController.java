package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Book;
import com.bookstore.service.IBookService;

@RestController
@Scope("request")
public class BookController {

	@Autowired
	private IBookService bookstoreService;
	
	@RequestMapping("/")
	public String Home() {
		return "Welcome To BookStore Portal";
	}
	
	@GetMapping(value = "/book", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBooks(){
		return bookstoreService.getAllBooks();
		
	}
	
	@GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Book getBookById(@PathVariable int id){
		return bookstoreService.getBooksById(id);
		
	}
	
	@GetMapping(value = "/getBookByTitle/{title}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Book getBookByTitle(@PathVariable String title){
		return bookstoreService.getBooksByTitle(title);
		
	}
	@GetMapping(value = "/getBookByPublisher/{publisher}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getBookByPublisher(@PathVariable String publisher){
		return bookstoreService.getBooksByPublisher(publisher);
		
	}
	@GetMapping(value = "/getBookByYear/{year}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getBookByYear(@PathVariable int year){
		return bookstoreService.getBooksByYear(year);
		
	}
	
}
