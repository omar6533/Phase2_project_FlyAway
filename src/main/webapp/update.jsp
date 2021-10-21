<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String NewPassword = request.getParameter("NewPassword");
session.setAttribute("NewPassword", NewPassword);
response.sendRedirect("adminLogin.jsp");
%>

</body>
</html>