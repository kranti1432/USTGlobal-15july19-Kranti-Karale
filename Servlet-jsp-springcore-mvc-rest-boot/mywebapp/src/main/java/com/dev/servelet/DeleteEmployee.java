package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.servelet.dao.EmployeeDaoImple;

@WebServlet("/deleteEmp")
public class DeleteEmployee extends HttpServlet {
	EmployeeDaoImple empImp=new EmployeeDaoImple();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String empid=req.getParameter("Id");
	int id=Integer.parseInt(empid);
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	if (empImp.deleteEmployee(id)) {
		out.println("<h1>Employee removed...</h1>");
	}else {
		out.println("<h1>Employee not removed...</h1>");
	}
	out.println("</body>");
	out.println("</html>");
	
}
}
