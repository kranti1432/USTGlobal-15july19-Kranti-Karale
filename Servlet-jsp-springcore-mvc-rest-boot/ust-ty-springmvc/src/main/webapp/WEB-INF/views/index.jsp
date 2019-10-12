<%-- <%@ page session="false" %> --%>
<html>
<body>
	<h2>${msg}</h2>
	<h3>********************************</h3>
	<h2><%=request.getAttribute("msg")%></h2>
	<%-- //same as ${msg} --%>
	
	<%=session.getAttribute("emp")%>
</body>
</html>
