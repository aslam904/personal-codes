<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
<h1>Forwarded page</h1>
<%--this is the syntax of comment--%>
<%--to print a string directly just type the string inside the body --%>
<br>
hello i am currently typing
<br/>
<%--to print a string in another way--%>
<br><%--this is used for enter key --%>
<%=new String("aslam") %><%--these two lines are declaration of a variable and displaying the variable --%>
<%!public int count=22; %>
<br/>
<br>
<%=count %>
<br/>
<br>
<%=new Integer(2212) %>
<br/>
<br>
<%= 2*98988 %>
<br/>
<br>
<%=25>4 %>
<br/>
<br>
<%
int a=23;
if(a%2==0){
	//sout here is used to display output in console not in webpage
	//out.println() is used to display output in web
	//jsp comment syntax  will not work inside scriplet and declaration
	//System.out.println(a+" is a even number");
	out.println(a+" is a even number");
}else{
	
	out.println(a+" is a odd number");
}
%>
<br/>
<%
for(int i=0;i<10;i++){
	out.print("<br>");//to enter the loop in different lines use br tags
	out.print("Elements are "+i*2);
	out.print("<br/>");
	//println will not enter in a new line both print and println works same in scriplets
	}

%>
<%!
public String printMessage(String str){
	return str;
}

public int add(int a,int b){
	return a+b;
}

//void methods dont work here
%>
<br>
<%=printMessage("Go and die") %>
<br/>
<br>
<%=add(876,908) %>
<br/>

<br>
<%@include file="file1.txt" %> <%--this is used for static files eg files with no updates in future --%>
<br/>

<br>  <%--can upload txt,html or jsp files only --%>
<jsp:include page="Hellohtml.html"></jsp:include>
<%--this is used for dynamic pages --%>
<br/><%-- include file and jsp:include both are same but has its uses --%>


<%--to import a class eg Date class from java --%>
<%@ page import="java.util.Date,com.main.Addition" %>
<%= new Date()  %>
<br>
<% out.print(new Addition().add(787,890)); %>
<br/>









</body>
</html>