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
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
session.setAttribute("name", name);
session.setAttribute("email", email);
session.setAttribute("phone", phone);

%>
<jsp:forward page="payment.jsp"></jsp:forward>

</body>
</html>