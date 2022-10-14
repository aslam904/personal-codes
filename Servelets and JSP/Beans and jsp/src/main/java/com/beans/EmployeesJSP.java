package com.beans;

public class EmployeesJSP {
	private String name;
	private int empNo;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public EmployeesJSP() {
		
	}
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", id=" + empNo + ", salary=" + salary + "]";
	}
	
	
}
