package com.bookstore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepo;

@Service
public class BookService implements IBookService  {
	
	@Autowired
	private BookRepo rep;

	@Override
	public Book save(Book book) {
		return rep.save(book);
	}

	@Override
	public Book update(Book book) {
		return rep.save(book);
	}

	@Override
	public void delete(int id) {
		rep.deleteById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return rep.findAll();
	}

	@Override
	public Book getBooksById(int id) {
		return rep.findById(id).get();
	}

	@Override
	public Book getBooksByTitle(String title) {
		return rep.getBookByTitle(title);	
	}
	
	@Override
	public List<Book> getBooksByPublisher(String publisher) {
		return rep.getBookByPublisher(publisher);
	}
	
	@Override
	public List<Book> getBooksByYear(int year) {
		return rep.getBookByYear(year);
	}



}
