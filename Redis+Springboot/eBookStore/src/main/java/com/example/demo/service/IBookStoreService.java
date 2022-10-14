package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Book;

public interface IBookStoreService {
	
	Book save(Book book);
	Book update(Book book);
	void delete(String id);
	//List<Book> getAllBooks();
	List<Book> getBookByTitle(String title);
	List<Book> getBookByPublisher(String publisher);
	List<Book> getBookByYear(String year);
	List<Book> getBookByPages(String pages);

}
