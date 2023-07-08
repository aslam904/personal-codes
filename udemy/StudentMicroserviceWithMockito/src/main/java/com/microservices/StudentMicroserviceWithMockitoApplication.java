package com.microservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.microservices.entity.Student;
import com.microservices.repository.StudentRepo;
import com.microservices.vo.Marks;

@SpringBootApplication
@EnableEurekaClient
public class StudentMicroserviceWithMockitoApplication implements CommandLineRunner {
	
	@Autowired
	StudentRepo rep;
	
	@Autowired
	RestTemplate rest;
	
	@Bean
	public RestTemplate restTemplate() {
		
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroserviceWithMockitoApplication.class, args);
		System.out.println("Student module running...");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		rep.save(new Student(1,"aslam","first","CSE","A+","aslam@gmail.com",1 ));
		rep.save(new Student(2,"aqeel","second","ECE","O+","aqeel@gmail.com",2));
		rep.save(new Student(3,"anwar","first","MECH","A+","anwar@gmail.com",3));
		rep.save(new Student(4,"sahana","first","CSE","O+","sahana@gmail.com",4));
		
		
		ResponseEntity<List> res=rest.exchange("http://localhost:8081/api/microservices/marks/gtpm", HttpMethod.GET, null, List.class);
		
		
		int si=res.getBody().size();
		System.out.println(si);
		
		
		
		
	}

}
