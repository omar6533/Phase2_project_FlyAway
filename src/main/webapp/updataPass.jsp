<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update.jsp">
<h2>Hi <%=session.getAttribute("uname") %></h2>
Enter the new password<input type="password" name="NewPassword">

<input type="submit" value="update">


</form>

</body>
</html>