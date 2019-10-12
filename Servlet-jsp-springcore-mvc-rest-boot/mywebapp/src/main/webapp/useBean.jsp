<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="emp1" class="com.ust.dto.EmployeeInfoBean"
	scope="application" />
<%@ include file="index.jsp"%>
<%@ page errorPage="error.jsp" %>

<%
int i=1/0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=emp1.getAge() %></h1>
	<h1><%=emp1.getDesignation() %></h1>
</body>
</html>