package com.mphasis.service;

import java.util.List;

import com.mphasis.entity.Book;

public interface IBookService {

	Book save(Book book); 
	Book update(Book book); 
	void delete(int id);  
	List<Book> getAllBooks();
	Book getBooksByPublisher(String publisher);
	Book getBooksByYear(String year);
	Book getBooksByTitle(String title);
	Book getBooksById(int id);
}
