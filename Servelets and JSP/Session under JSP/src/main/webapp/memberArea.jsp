<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MEMBER AREA </title>
</head>
<body>

<%

String username=null;
String sessionID=null;
//retreiving username and sessionid using cookies

/*
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("username")){
			username=cookie.getValue();
		}
		
		//if u check a cookie the varname of session id is JSESSIONID
		if(cookie.getName().equals("JSESSIONID")){
			sessionID=cookie.getValue();
		}
		
	}
}  

if(sessionID==null|| username==null){
	response.sendRedirect("login.jsp");
}

*/

//retrieving username and sessionid  using session attribute
// this part is done because some one can copy the logged in url of ur account and paste it in another device or browser
//and login to ur account and  create a authentication problem (they can hack ur acc). This part makes sure that the copied link is logged out
//when pasted in another device 
if(request.getSession().getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}else{
	//as request.getSession.getAttribute() returns a object it will show error so to store in username we convert it to string
	username=request.getSession().getAttribute("username").toString();
	sessionID=request.getSession().getId();
	
}

%>

User name: <%=username %><br/>
Session ID: <%=sessionID %><br/>
memberArea!!!!!!

<form action="<%=request.getContextPath()%>/MemberAreaServlet" method="get">

<input type="hidden" name="action" value="destroy"> <%--the value parameter will be used in switch statement --%>
<input type="submit" value="logout">

<%-- for logout button this is the code --%>


</form>

</body>
</html>