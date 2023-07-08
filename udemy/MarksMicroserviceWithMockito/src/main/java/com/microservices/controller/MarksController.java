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

import com.microservices.entity.Marks;
import com.microservices.service.MarksService;


@RestController
@Scope("request")
@RequestMapping("api/microservices")
public class MarksController {
	
	@Autowired
	MarksService ser;
	
	@PostMapping(value="/marks/inm", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Marks> addNewMarks(@RequestBody Marks marks) {
		// TODO Auto-generated method stub
		Marks savedMark=ser.addNewMarks(marks);
		return new ResponseEntity<>(savedMark, HttpStatus.CREATED);
	}

	@GetMapping(value="/marks/gtm", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Marks>> getAllMarks() {
		// TODO Auto-generated method stub
		List<Marks> marks=ser.getAllMarks();
		return new ResponseEntity<>(marks,HttpStatus.OK);
	}

	@GetMapping(value="/marks/gtm/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Marks> getMarksByid(@PathVariable int id) {
		// TODO Auto-generated method stub
		Marks marks=ser.getMarksByid(id);
		return new ResponseEntity<>(marks, HttpStatus.OK);
	}
	
	@GetMapping(value="/marks/gtpm/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Marks getPassedMarksByid(@PathVariable int id) {
		return ser.getPassedMarksByid(id);
	}
	
	@GetMapping(value="/marks/gtpm", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Marks> getMarksOfPassedStudents() {
		return ser.getMarksOfPassedStudents();
		
	}

	@PutMapping(value="/marks/upm", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Marks> updateMarksDetails(@PathVariable int id, @RequestBody Marks marks) {
		// TODO Auto-generated method stub
		marks.setmId(id);
		Marks updatedMarks=ser.updateMarksDetails(marks);
		return new ResponseEntity<>(updatedMarks,HttpStatus.OK);
	}


	@DeleteMapping(value="/marks/rmm/{id}")
	public ResponseEntity<String> removeMarksDetails(@PathVariable int id) {
		 ser.removeMarksDetails(id);
		 return new ResponseEntity<>("Marks successfully deleted!", HttpStatus.OK);
			
	}


}
