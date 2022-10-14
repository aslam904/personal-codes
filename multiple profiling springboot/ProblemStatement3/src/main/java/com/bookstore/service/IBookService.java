package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface IBookService {

	Book save(Book book); 
	Book update(Book book); 
	void delete(int id);  
	List<Book> getAllBooks();
	List<Book> getBooksByPublisher(String publisher);
	List<Book> getBooksByYear(int year);
	Book getBooksByTitle(String title);
	Book getBooksById(int id);
}
