<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login1" method="post">
	<table>
		<tr>
			<td>Id:</td>
			<td><input type="number" name="id" required>
		</tr>
		<tr>
			<td>password:</td>
			<td><input type="password" name="password" required>
		</tr>
		<tr>
			<td><input type="submit" value="submit">
		</tr>
		</table>
	</form>
	<a href="./register">Sing Up</a>
</body>
</html>