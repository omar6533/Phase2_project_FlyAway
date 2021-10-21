<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.sql.*"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<sql:setDataSource var = "connect" url="jdbc:mysql://localhost:3306/omar" driver="com.mysql.cj.jdbc.Driver" user="root" password="Ss123456"/>
<sql:query var="rs" dataSource="${connect}">
SELECT * FROM omar.flights;
</sql:query>

<sql:update></sql:update>

</body>
</html>