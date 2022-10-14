<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SET PROPERTY</title>
</head>
<body>

<jsp:useBean id="employee" class="com.beans.EmployeesJSP" scope="session"></jsp:useBean>
<form action="getProperty.jsp">
Employee id: <input type="text"name="empNo" value='<jsp:getProperty property="empNo" name="employee" />'><br/>
Employee name: <input type="text"name="name" value='<jsp:getProperty property="name" name="employee" />'><br/>
Employee salary: <input type="text"name="salary" value='<jsp:getProperty property="salary" name="employee" />'><br/>
<input type="submit" value="submit">
</form>
</body>
</html>


<%-- numbers should also have double quotes inside vlue variable in setProperty tag--%>