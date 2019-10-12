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
<div>
<span><a href="./home">Home</a></span>
<span  style="float: right;"><a href="./logout">Logout</a></span>
</div>
<form action="./update" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="number" name="id" value="<%=employee.getId() %>>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="<%=employee.getName() %>>"></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<td>Pasword:</td>
				<td><input type="password" name="password" value="<%=employee.getPassword() %>>"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>