<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="submit.jsp" method="get">

Full name:      <input type="text" name="name"/><br/>
Gender:         <input type="radio" name="gender" value="male">  Male
                <input type="radio" name="gender" value="female">Female<br/>
Languages known:<input type="checkbox" name="langauge" value="english" checked /> English
                <input type="checkbox" name="langauge" value="tamil" checked /> Tamil
                <input type="checkbox" name="langauge" value="hindi" checked /> Hindi
                <input type="checkbox" name="langauge" value="french" checked /> French <br/> 
                
                <%--give the value for  name in small letters or will show null value --%>
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
                
                <input type="submit" value="Submit">
</form>                
</body>            
</html>