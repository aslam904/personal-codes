package com.microservices.vo;

import com.microservices.entity.Student;

public class ResponseTemplateVo {
	
	private Student stud;
	private Marks marks;
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public ResponseTemplateVo(Student stud, Marks marks) {
		super();
		this.stud = stud;
		this.marks = marks;
	}
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseTemplateVo [stud=" + stud + ", marks=" + marks + "]";
	}
	
	
	

}
