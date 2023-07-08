package com.microservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.entity.Student;
import com.microservices.repository.StudentRepo;
import com.microservices.vo.Marks;
import com.microservices.vo.ResponseTemplateVo;

@Service("StudentService")
public class StudentService implements IStudentService{
	
	
	@Autowired
	@Qualifier("StudentRepository")
	StudentRepo rep;
	
	@Autowired
	RestTemplate rest;

	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return rep.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		 Student existingStudent = rep.findById(student.getId()).get();
	     existingStudent.setName(student.getName());
	     existingStudent.setYear(student.getYear());
	     existingStudent.setDept(student.getDept());
	     existingStudent.setBloodGroup(student.getBloodGroup());
	     existingStudent.setEmail(student.getEmail());
	     existingStudent.setmId(student.getmId());
	     Student updatedStudent=rep.save(existingStudent);
	     return updatedStudent;
	}

	@Override
	public void removeStudentDetails(int id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
		
	}

	@Override
	public Student getStudentByid(int id) {
		// TODO Auto-generated method stub
		return rep.findById(id).get();
	}
	
	public ResponseTemplateVo getStudentWithMarksUsingId(int id) {
		ResponseTemplateVo res=new ResponseTemplateVo();
		Student student=rep.findById(id).get();
		Marks marks=rest.getForObject("http://localhost:8081/api/microservices/marks/gtm/" + student.getId(), Marks.class);
		res.setStud(student);
		res.setMarks(marks);
		return res;
	}
	
	public ResponseEntity<List> getMarksOfAllStudents() {
		ResponseEntity<List> res=rest.exchange("http://localhost:8081/api/microservices/marks/gtm", HttpMethod.GET, null, List.class);
		return res;
	}

	public ResponseEntity<List> getMarksOfAllPassedStudents() {
		ResponseEntity<List> res=rest.exchange("http://localhost:8081/api/microservices/marks/gtpm", HttpMethod.GET, null, List.class);
		return res;
	}

	public void add(int a,int b) {
		System.out.println(a+b);
	}
		
		
		
	}
	
	
	
	
	
	


