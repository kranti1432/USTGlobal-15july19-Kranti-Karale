<%@page import="com.tyss.usttyspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Employee employee=(Employee)session.getAttribute("emp");
%>
<body>
	<div align="right">
	<span><a href="./update">Update Profile</a></span>
	<span><a href="./delete?id=<%=employee.getId()%>">Delete Profile</a></span>
	<span><a href="./logout">Logout</a></span>
	</div>
	<h2>Welcome <%=employee.getName()%></h2>
	<a href="./show-all">Show All Employee</a>
	
	<h3>${msg}</h3>
</body>
</html>