package com.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
	
	
		@Query(value=("select * from book where book.book_title = ? "), nativeQuery = true)
		public Book getBookByTitle(String title);
		
		@Query(value=("select * from book where book.book_publisher = ? "), nativeQuery = true)
		public List<Book> getBookByPublisher(String publisher);
		
		@Query(value=("select * from book where book.book_year = ? "), nativeQuery = true)
		public List<Book> getBookByYear(int year);



}
