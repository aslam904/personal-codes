package com.example.demo.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends CrudRepository <Book, String> {

	List<Book> findBookByName(String name);
	List<Book> findBookByPublisher(String publisher);
	List<Book> findBookByYear(String year);
	List<Book> findBookByPages(String pages);
	
	
	

}
