package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Timestamp;

public class CRUD_operations {

	public static void main(String[] args) {
		
		
		try {//for old version connector use "com.mysql.jdbc.cj.Driver"
			Class.forName("com.mysql.cj.jdbc.Driver");//will show exception at first
			System.out.println("driver loaded");//have to add connector to avoid exception
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aqeel","root","Muhammadpbuh@904");
			System.out.println("database is connected...");
			Scanner sc=new Scanner(System.in);
			Date date= new Date();
			Object param= new Timestamp(date.getTime());
			System.out.println(param);
			
			Statement stmt=con.createStatement();System.out.println("enter your choice");
			String choice=sc.next();
			switch(choice) {
			case "insert":
				PreparedStatement pstmt=con.prepareStatement("insert into worker values(?,?,?,?,?,?)");
				System.out.println("enter id");
				int workerid=sc.nextInt();
				pstmt.setInt(1, workerid);
				System.out.println("enter firstname");
				String firstname=sc.next();
				pstmt.setString(2, firstname);
				System.out.println("enter lastname");
				String lastname=sc.next();
				pstmt.setString(3,lastname);
				System.out.println("enter salary");
				float salary=sc.nextFloat();
				pstmt.setFloat(4, salary);
				pstmt.setObject(5,param);
				System.out.println("enter dept");
				String dept=sc.next();
				pstmt.setString(6, dept);
				int res=pstmt.executeUpdate();
				if(res>0) {
					System.out.println("records inserted sucessfully");
				}else {
					System.out.println("records not inserted");
				}
				break;
			default:
				System.out.println("problem");
				break;
				
			}
				

			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}

	}
