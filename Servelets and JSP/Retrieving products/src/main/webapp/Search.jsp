<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search products</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/SearchController" method="get">

Search: <input type="text" name="name"><br/>
<input type="submit" name="submit" value="search">







</form>


</body>
</html>