<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello  <%= session.getAttribute("name") %> </h2>
<h5>thank you for registering please pay to confirm your bookin.</h5><br>
<a href="confirm.jsp">pay</a>

</body>
</html>