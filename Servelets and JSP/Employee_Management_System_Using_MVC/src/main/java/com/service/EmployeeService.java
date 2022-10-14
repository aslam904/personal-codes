package com.service;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	
	EmployeeDao ed=new EmployeeDao();

	public List<Employee> getAllEmployee(){
		return ed.getAllEmployee();
	}
	
	
	
	public String storeEmployee(Employee emp) {
		if(ed.storeEmployee(emp)>0) {
			return "Record stored sucessfully";
		}else {
			return "Record not found";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted";
		}else {
			return "Record not deleted";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Record updated";
		}else {
			return "Record not updated";
		}
	}

	

}
