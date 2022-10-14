<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request forwarded</title>
<%--the below code inside this comment is only used to forward jsp files 


<jsp:forward page="Redirect.jsp"></jsp:forward>

 --%>

<%
//this code can be use in both jsp and servlet for forwarding. In forwarding the forwarded website will be hidden this current webpage will be shown
//request.getRequestDispatcher("HiJSP.jsp").forward(request, response);
		
//this code is used to redirect pages. In redirecting the page is getting redirected to that page so the redirected page's url will be shown 
//response.sendRedirect("Redirect.jsp");//can also provide a url inside this
response.sendRedirect("https://www.google.co.in/");
%>

</head>
<body>
forwarding....
</body>
</html>