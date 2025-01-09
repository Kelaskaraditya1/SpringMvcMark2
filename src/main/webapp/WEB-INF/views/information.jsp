<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information Page</title>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


<%


/* String name = request.getParameter("name");
String userName = request.getParameter("userName");
String email = request.getParameter("email");
String phoneNo = request.getParameter("phoneNo");
String password = request.getParameter("password"); */



%>

<h2>Name:${name}</h2>
<h2>Username:${username }</h2>
<h2>Email:${email }</h2>
<h2>PhoneNo:${phoneNo}</h2>
<h2>Password:${password}</h2>


</body>
</html>