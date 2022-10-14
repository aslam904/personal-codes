package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.bean.Employee;
import com.resource.DBResource;

public class EmployeeDao {
	
public List<Employee> getAllEmployee(){
		
		SessionFactory sf =DBResource.getSessionFactory();
		Session session=sf.openSession();
		Query<Employee> qry=session.createQuery("select e from Employee e");
		List<Employee> listOfEmp=qry.list();
		return listOfEmp;
		
	}
	
	public int storeEmployee(Employee emp) {
		try {
			SessionFactory sf=DBResource.getSessionFactory();
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(emp);
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int deleteEmployee(int id) {
		
			SessionFactory sf=DBResource.getSessionFactory();
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			Employee emp=session.get(Employee.class, id);
			if(emp==null) {
				return 0;
			}else {
				tran.begin();
				session.delete(emp);
				tran.commit();
				return 1;
			}
	}
	
	public int updateEmployee(Employee e) {
		SessionFactory sf=DBResource.getSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.getTransaction();
		Employee emp=session.get(Employee.class, e.getId());
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			//emp.setSalary(e.getSalary()+e.getSalary());  for increment
			emp.setSalary(e.getSalary());
			session.update(emp);
			tran.commit();
			return 1;
		}
	}
	
	
	
	
}
