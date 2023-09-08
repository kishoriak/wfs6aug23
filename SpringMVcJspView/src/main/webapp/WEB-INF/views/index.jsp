<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Welcome to SpringMVC annotation configaration</h3>
    ${msg}
    <form action="login/validateUser" method="post">
       Username :<input type="text" name="uname">
       Password :<input type="password" name="pass">
       <button type="submit">Login</button>
    </form>
    
    <a href="hello">Say hello</a>
    
</body>
</html>