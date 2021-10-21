<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome <%= session.getAttribute("uname") %></h1>
<h3>what do you want to do? </h3>

<a href="list.jsp">see all avalibale flights in DB</a><br>
<a href="add.html">add a new flight</a><br>
<a href="updataPass.jsp">update password</a>

</body>
</html>