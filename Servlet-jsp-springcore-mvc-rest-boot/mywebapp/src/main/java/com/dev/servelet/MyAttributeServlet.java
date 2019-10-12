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

@WebServlet("/myattribute")
public class MyAttributeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context=getServletContext();
	EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) context.getAttribute("emp1");
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h3>Employee Details Are: </h3>");
	out.println("Id: "+employeeInfoBean.getAge());
	out.println("name: "+employeeInfoBean.getEmp_name());
	out.println("age: "+employeeInfoBean.getAge());
	out.println("salary: "+employeeInfoBean.getSalary());
	out.println("designation: "+employeeInfoBean.getDesignation());
	out.println("</body>");
	out.println("</html>");
}
}
