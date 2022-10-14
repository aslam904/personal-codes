<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>set value using scriplet tags</h2>
<%
Employee emp=new Employee();
emp.setId(100);
emp.setName("farook");
emp.setSalary(10000);

out.println("<br/> emp id is "+emp.getId());
out.println("<br/> emp name is "+emp.getName());
out.println("<br/> emp salary is "+emp.getSalary());

%>

<h2>set values using jsp tags</h2>
<jsp:useBean id="emp1" class="com.bean.Employee">
<jsp:setProperty property="id" name="emp1" value="786"/>
<jsp:setProperty property="name" name="emp1" value="Thor"/>
<jsp:setProperty property="salary" name="emp1" value="786987"/>
</jsp:useBean>

Id : <jsp:getProperty property="id" name="emp1"/><br/>
Name: <jsp:getProperty property="name" name="emp1"/><br/>
Salary: <jsp:getProperty property="salary" name="emp1"/><br/>
</body>
</html>