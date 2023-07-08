package com.microservices.service;

import java.util.List;

import com.microservices.entity.Student;
import com.microservices.vo.ResponseTemplateVo;

public interface IStudentService {

	Student addNewStudent(Student student);
	List<Student> getAllStudent();
	Student updateStudentDetails(Student student);
	void removeStudentDetails(int id);
	Student getStudentByid(int id);
	
	
}
