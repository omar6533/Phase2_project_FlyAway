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
String uname= request.getParameter("uname");
String password= request.getParameter("password");
String pass=(String)session.getAttribute("NewPassword");

if(uname.equals("omar")&&password.equals(pass)||password.equals("omar123")){
	session.setAttribute("uname", uname);
%>
<jsp:forward page="admin.jsp"></jsp:forward>
<%}
else{
	response.sendRedirect("adminLogin.jsp");
	out.println("please enter a vaild user Name and password");
	
%>


<%}

%>


</body>
</html>