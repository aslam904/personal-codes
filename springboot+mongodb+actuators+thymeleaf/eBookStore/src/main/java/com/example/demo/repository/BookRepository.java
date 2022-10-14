package com.example.demo.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends MongoRepository <Book, String> {

//different ways to use this repository

	 @Query("{name:'?0'}")
	 List<Book> findBookByTitle(String title);
	
	 @Query("{publisher:'?0'}")
	 List<Book> findBookByPublisher(String publisher);
	 List<Book> findBookByYear(String year);
	 List<Book> findBookByPages(String pages);
	 
	 
	

}
