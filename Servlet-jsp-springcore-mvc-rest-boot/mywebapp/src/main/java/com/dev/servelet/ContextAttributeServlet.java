package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dto.EmployeeInfoBean;
@WebServlet("/contextAttribute")
public class ContextAttributeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EmployeeInfoBean emp=new EmployeeInfoBean();
	emp.setAge(42);
	emp.setDesignation("qruowiuo");
	emp.setEmp_id(87);
	emp.setEmp_name("sadjlaj");
	emp.setSalary(82124);
	
	ServletContext context=req.getServletContext();
	context.setAttribute("emp1",emp);
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	out.println("<h3>Context Attribute has been set...");
	out.println("</body>");
	out.println("</html>");
}//end of doGet()
}//end of class
