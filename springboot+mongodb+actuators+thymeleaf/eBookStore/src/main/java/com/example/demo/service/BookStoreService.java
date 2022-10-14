package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;

@Service("bookstoreService")
@Scope("singleton")
public class BookStoreService implements IBookStoreService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(String id) {
		bookRepository.deleteById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getBookByTitle(String title){
		return bookRepository.findBookByTitle(title);
	}
	
	@Override
	public List<Book> getBookByPublisher(String publisher){
		return bookRepository.findBookByPublisher(publisher);
	}

	@Override
	public List<Book> findBookByYear(String year) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByYear(year);
	}

	@Override
	public List<Book> findBookByPages(String pages) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByPages(pages);
	}
}
