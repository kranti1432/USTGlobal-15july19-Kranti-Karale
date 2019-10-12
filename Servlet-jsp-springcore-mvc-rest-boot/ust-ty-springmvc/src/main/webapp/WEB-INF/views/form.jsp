<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Pasword:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>