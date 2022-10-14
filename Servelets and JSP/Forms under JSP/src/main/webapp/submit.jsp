<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit page</title>
</head>
<body>
Form submitted successfully<br/>

Name           : <%= request.getParameter("name") %><br/>
Gender         : <%= request.getParameter("gender") %><br/>
Languages known: <%

String[] lang=request.getParameterValues("langauge");
if(lang != null){
	for(int i=0;i<lang.length;i++){
		out.print(lang[i]+" ");		
	}
}else{
	out.print("None selected");
}
%><br/>

Country        : <%= request.getParameter("country") %><br/>



</body>
</html>