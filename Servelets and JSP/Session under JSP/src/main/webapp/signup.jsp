<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/SiteController" method="post">

Full name:      <input type="text" name="name"/><br/>
Gender:         <input type="radio" name="gender" value="male">  Male
                <input type="radio" name="gender" value="female">Female<br/>
Email:          <input type="email" name="username" required="required"> <br/>               
Password:       <input type="password" name="password" required="required"> <br/>               
        
Country:        <select name="country">
                <option value="India">India</option>
                <option value="India">UAE</option>
                <option value="India">USA</option>
                <option value="India">UK</option>
                <option value="India">Japan</option>
                <option value="India">Canada</option>
                <option value="India">China</option>
                <option value="India">Russia</option>
                </select><br/>
                <input type="hidden" name="action" value="accCreate">
                <input type="submit" value="Submit">
</form>                

</body>
</html>