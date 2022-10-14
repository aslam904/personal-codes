<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
this is home page
<br><a href="<%=request.getContextPath() %>/Controller?page=login">Login</a><br/>
<br><a href="<%=request.getContextPath() %>/Controller?page=signup">Signup</a><br/>
<br><a href="<%=request.getContextPath() %>/Controller?page=about">About</a><br/>



</body>
</html>