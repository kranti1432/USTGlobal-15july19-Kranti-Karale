package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getemp")
public class GetEmployeeServelet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String empIdVal=req.getParameter("empId");
	int empId=Integer.parseInt(empIdVal);
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	if (empId==102) {                         //?empId=102
		out.println("<h2 style=\"color:blue\">Employee details for employee id: "+empId+" - </h2>");
		out.println("Id=103<br>");
		out.println("<h6></h6>");//add for one line space
		out.println("Name=kranti <br>");
		out.println("<h6></h6>");
		out.println("Age=23 <br>");
		out.println("<h6></h6>");
		out.println("Phone=9527825551 <br>");
		out.println("<h6></h6>");
		out.println("Salary=29000 <br>");
	} else {
out.println("<h2 style=\"color:red\">Record not found for EmpId "+empId+"</h2>");
	}
	out.println("</html>");
	out.println("</body>");
}
}
