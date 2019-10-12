<%@page import="com.tyss.usttyspringmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<Employee> employees = (List) request.getAttribute("list");
	Employee emp = (Employee) session.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="right">
		<span><a href="./update">Update Profile</a></span> <span><a
			href="./delete?id=<%=emp.getId()%>">Delete Profile</a></span> <span><a
			href="./logout">Logout</a></span>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DOB</th>
			<th>EMAil</th>
		</tr>
		<tr>
			<%
				for (Employee employee : employees) {
			%>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getDob()%></td>
			<td><%=employee.getEmail()%></td>

		</tr>
		<%
			}
		%>
	</table>
</body>
</html>