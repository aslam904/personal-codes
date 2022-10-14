<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GET PROPERTY</title>
</head>
<body>
<jsp:useBean id="employee" class="com.beans.EmployeesJSP" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="employee"/>
Employee ID: <jsp:getProperty property="empNo" name="employee"/><br/>
Employee name:<jsp:getProperty property="name" name="employee"/><br/>
Employee salary:<jsp:getProperty property="salary" name="employee"/><br/>
</body>
</html>