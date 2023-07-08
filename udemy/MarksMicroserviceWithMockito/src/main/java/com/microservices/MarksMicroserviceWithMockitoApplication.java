package com.microservices;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.microservices.entity.Marks;
import com.microservices.repository.MarksRepo;
import com.microservices.service.MarksService;

@SpringBootApplication
@EnableEurekaClient
public class MarksMicroserviceWithMockitoApplication implements CommandLineRunner {
	
	@Autowired
	MarksRepo rep;
	
	@Autowired
	MarksService marksService;

	public static void main(String[] args) {
		SpringApplication.run(MarksMicroserviceWithMockitoApplication.class, args);
		System.out.println("Marks module working......");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		rep.save(new Marks(1,45,67,89,87,54));
		rep.save(new Marks(2,75,63,29,77,53));
		rep.save(new Marks(3,85,69,99,67,52));
		rep.save(new Marks(4,95,77,90,57,51));
		
		marksService.setStatusReasonCombinations();
		marksService.getCardWatchStartDate();
		marksService.testCPS();
		marksService.testCustCPS();
		marksService.setStartDate("20230621");
		
		
	}
	
	

}
