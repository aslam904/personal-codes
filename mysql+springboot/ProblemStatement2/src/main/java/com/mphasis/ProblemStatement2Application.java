package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.entity.Book;
import com.mphasis.repository.BookRepo;

@SpringBootApplication
public class ProblemStatement2Application implements CommandLineRunner {

	@Autowired
	private BookRepo rep;
	
	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement2Application.class, args);
		System.out.println("Starting...");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		rep.save(new Book(1,"Effective Java","Joshua bloch","978-6789657658","200","2001"));
		rep.save(new Book(2,"Tinkle comics","Rajini","964-3289634658","20","1998"));
		rep.save(new Book(3,"Percy jackson","Rick","632-4589676658","200","2001"));
		

	}

}
