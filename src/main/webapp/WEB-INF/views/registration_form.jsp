<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>

<form action="process" method="post">

<div class="form-group">
<label>Name:</label>
<input type="text" id="name" class="form-control" placeholder="Enter your Name" name="name">
</div>

<br/>

<div class="form-group" method="post">
<label>Username:</label>
<input type="text" id="userName" class="form-control" placeholder="Enter your Username" name="username">
</div>

<br/>

<div class="form-group">
<label>Email:</label>
<input type="email" id="email" class="form-control" placeholder="Enter your Email" name="email">
</div>

<br/>

<div class="form-group">
<label>PhoneNo:</label>
<input type="text" id="phoneNo" class="form-control" placeholder="Enter your PhoneNo" name="phoneNo">
</div>

<br/>


<div class="form-group">
<label>Password:</label>
<input type="password" id="password" class="form-control" placeholder="Enter your Password" name="password">
</div>

<br/>

<input type="submit" value="submit">

</form>

</body>
</html>