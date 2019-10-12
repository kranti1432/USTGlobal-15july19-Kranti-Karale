<%@page import="java.util.Date"%>
<%! private int count=100; %>
<%!
public void jspInit(){
System.out.println("init");
}
%>
<%! 
public void jspDestroy(){
	System.out.println("destroy");
}
%>
<% int count=0; %>
<% Date date=new Date(); %>
<html>
<body>
<h2>Hello World!</h2>
<h3>value of count is=<%=count %></h3>
<h3>current date and system is</h3>
<h3><%=date %></h3>
</body>
</html>
