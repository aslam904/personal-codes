<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/SiteController" method="post">
Username: <input type="text" name="username" ><br/>
Password: <input type="password" name="password" ><br/>
<input type="hidden" name="action" value="authentiate">
<input type="submit" value="Login">
</form>

<form action="<%=request.getContextPath()%>/SiteController" method="get">
<input type="hidden" name="action" value="create"> 
<input type="submit" value="create">
</form>

</body>
</html>