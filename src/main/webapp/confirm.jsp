<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Thank you <%= session.getAttribute("name") %></h3>
<h5>Here is your booking details: </h5><br><br>

<h5>
name: <%= session.getAttribute("name") %><br>
email: <%= session.getAttribute("email") %><br>
phone: <%= session.getAttribute("phone") %><br><br><br>
</h5>


<h5>your ticket: </h5><br>
<h5>
Date: <%=session.getAttribute("a") %><br>
Source: <%= session.getAttribute("b") %><br>
Distination: <%= session.getAttribute("c") %><br>
NoPeople: <%= session.getAttribute("d") %><br>
</h5>




</body>
</html>