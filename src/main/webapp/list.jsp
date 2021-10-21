<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<c:forEach var="p" items="${rs.rows}" >

<c:out value="id: ${p.id},"></c:out>
<c:out value=" source: ${p.source},"></c:out>
<c:out value="distination: ${p.destination},"></c:out>
<c:out value=" noPeople: ${p.noPeople},"></c:out>
<br>
</c:forEach>


</body>
</html>