<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome to home page:</h1>
<a href="<%=request.getContextPath()%>/SiteController?action=Login">Login</a> <br/>
<a href="<%=request.getContextPath()%>/SiteController?action=Create">Create</a> 

</html>