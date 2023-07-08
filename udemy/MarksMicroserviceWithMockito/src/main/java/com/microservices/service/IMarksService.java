package com.microservices.service;

import java.util.List;

import com.microservices.entity.Marks;

public interface IMarksService {
	
	Marks addNewMarks(Marks marks);
	List<Marks> getAllMarks();
	Marks updateMarksDetails(Marks marks);
	void removeMarksDetails(int id);
	Marks getMarksByid(int id);
	Marks getPassedMarksByid(int id);
	List<Marks> getMarksOfPassedStudents();

}
