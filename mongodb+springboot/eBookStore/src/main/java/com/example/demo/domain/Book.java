package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Book {

	@Id
	private String id;
	private String name;
	private String publisher;
	private String isbn;
	private String pages;
	private String year;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publisher=" + publisher + ", isbn=" + isbn + ", pages=" + pages
				+ ", year=" + year + "]";
	}
	public Book(String id, String name, String publisher, String isbn, String pages, String year) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.isbn = isbn;
		this.pages = pages;
		this.year = year;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
