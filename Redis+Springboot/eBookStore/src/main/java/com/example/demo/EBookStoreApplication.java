package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;

@SpringBootApplication
public class EBookStoreApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreApplication.class, args);
		System.out.println("Server is running . . .");
	}

	@Override
	public void run(String... args) throws Exception {
	
		bookRepository.save(new Book("101", "Core Java", "Java Publications", "342-1235006","400","2001"));
		bookRepository.save(new Book("102", "Oracle", "Oracle publications", "250-8684560","350","1998"));
		bookRepository.save(new Book("103", "Spring", "Spring publications", "340-0895674","200","2001"));
		bookRepository.save(new Book("10", "Java Microservices", "Java Publications", "280-0657685","250","2003"));
		
		
	}

}
