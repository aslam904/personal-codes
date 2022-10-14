package com.mphasis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book{

	@Id
	private Integer book_id;
	private String book_title;
	private String book_publisher;
	private String book_isbn;
	private String book_pages;
	private String book_year;
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_pages() {
		return book_pages;
	}
	public void setBook_pages(String book_pages) {
		this.book_pages = book_pages;
	}
	public String getBook_year() {
		return book_year;
	}
	public void setBook_year(String book_year) {
		this.book_year = book_year;
	}
	public Book(Integer book_id, String book_title, String book_publisher, String book_isbn, String book_pages,
			String book_year) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_publisher = book_publisher;
		this.book_isbn = book_isbn;
		this.book_pages = book_pages;
		this.book_year = book_year;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_publisher=" + book_publisher
				+ ", book_isbn=" + book_isbn + ", book_pages=" + book_pages + ", book_year=" + book_year + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
