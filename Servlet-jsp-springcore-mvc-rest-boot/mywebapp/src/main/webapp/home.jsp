<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="bean" class="com.ust.dto.EmployeeInfoBean" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue">Welcome <%=bean.getEmp_name()%></h1>
<br>
<div align="right"><a href="./delete11?id=<%=bean.getEmp_id()%>">Delete Profile</a></div>
<div align="right"><a href="./logout1">Logout</a></div>
<a></a>
</body>
</html>