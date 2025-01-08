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

<h2>Name:${user.name}</h2>
<h2>Username:${user.username }</h2>
<h2>Email:${user.email }</h2>
<h2>PhoneNo:${user.phoneNo}</h2>
<h2>Password:${user.password}</h2>


</body>
</html>