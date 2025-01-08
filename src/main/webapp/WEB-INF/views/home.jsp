<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String sid = request.getParameter("StudentId");
String name = request.getParameter("StudentName");
String department = request.getParameter("Department");


%>

<h2>The Sudent Id of the Student is:<%=sid %> </h2>
<h2>The Name of the Student is:<%=name %> </h2>
<h2>The Departmenr of the Student is:<%=department %> </h2>

</body>
</html>