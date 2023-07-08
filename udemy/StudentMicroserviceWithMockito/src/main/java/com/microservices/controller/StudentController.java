package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entity.Student;
import com.microservices.service.StudentService;
import com.microservices.vo.ResponseTemplateVo;

@RestController
@Scope("request")
@RequestMapping("api/microservices")
public class StudentController {
	
	@Autowired
	StudentService ser;
	
	@PostMapping(value="/student/ins", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		Student savedStudent=ser.addNewStudent(student);
		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}

	@GetMapping(value="/student/gts", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Student>> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> students=ser.getAllStudent();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}

	@GetMapping(value="/student/gts/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Student> getStudentByid(@PathVariable int id) {
		// TODO Auto-generated method stub
		Student stu=ser.getStudentByid(id);
		return new ResponseEntity<>(stu, HttpStatus.OK);
	}

	@PutMapping(value="/student/ups", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Student> updateStudentDetails(@PathVariable int id, @RequestBody Student student) {
		// TODO Auto-generated method stub
		student.setId(id);
		Student stu=ser.updateStudentDetails(student);
		return new ResponseEntity<>(stu,HttpStatus.OK);
	}


	@DeleteMapping(value="/student/rms/{id}")
	public ResponseEntity<String> removeStudentDetails(@PathVariable int id) {
		 ser.removeStudentDetails(id);
		 return new ResponseEntity<>("Student successfully deleted!", HttpStatus.OK);
			
	}
	
	@GetMapping(value="/student/gtswm/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ResponseTemplateVo> getStudentWithMarksUsingId(@PathVariable int id) {
		
		 ResponseTemplateVo vo=ser.getStudentWithMarksUsingId(id);
		 return new ResponseEntity<>(vo, HttpStatus.OK);
	}

	@GetMapping(value="/student/gtsm", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List> getMarksOfAllStudents() {
		ResponseEntity<List> res=ser.getMarksOfAllStudents();
		return res;
	}
	
	@GetMapping(value="/student/gtpsm", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List> getMarksOfAllPassedStudents() {
		ResponseEntity<List> res=ser.getMarksOfAllPassedStudents();
		return res;
	}
	
	


}
