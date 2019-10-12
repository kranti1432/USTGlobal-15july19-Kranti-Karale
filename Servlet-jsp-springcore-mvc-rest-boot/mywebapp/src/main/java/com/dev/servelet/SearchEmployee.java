package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.servelet.dao.EmployeeDaoImple;
import com.dev.servelet.dao.EmployeeDeo;
import com.ust.dto.EmployeeInfoBean;
@WebServlet("/searchEmp")
public class SearchEmployee extends HttpServlet{
	private EmployeeDeo dao=new EmployeeDaoImple();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
HttpSession session=req.getSession(false);
	if(session!=null) {
	String empid=req.getParameter("empId");	
int id=Integer.parseInt(empid);
EmployeeInfoBean employeeInfoBean= dao.searchEmployee(id);
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
out.println("<html>");
out.println("<body>");
if(employeeInfoBean!=null) {
	out.println("<h3>Employee data for employee_id:"+ id+"<h3>");
	out.println("<br>employee_id: "+employeeInfoBean.getEmp_id());
	out.println("<br>employee_name: "+employeeInfoBean.getAge());
	out.println("<br>employee_name: "+employeeInfoBean.getDesignation());
	out.println("<br>employee_name: "+employeeInfoBean.getEmp_name() );
	out.println("<br>employee_name: "+employeeInfoBean.getSalary() );
}else {
	out.println("<h2>Employee record for id "+id+"not found!!!<h2>");
}
out.println("</body>");
out.println("</html>");
	}else {
		resp.sendRedirect("./loginform.html");
	}
}//end of doGet
}//end of class
