package com.microservices.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Student;

@Repository("StudentRepository")
@Scope("singleton")
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	

}
