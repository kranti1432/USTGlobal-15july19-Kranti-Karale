package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.servelet.dao.EmployeeDaoImple;
import com.dev.servelet.dao.EmployeeDeo;
import com.ust.dto.EmployeeInfoBean;

@WebServlet("/addEmp")
public class AddEmployee extends HttpServlet {
//	private EmployeeDeo dao=new EmployeeDeo();
	EmployeeDaoImple daoImple=new EmployeeDaoImple();
	Scanner sc=new Scanner(System.in);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		resp.setContentType("text/html");
		String str=req.getParameter("name");
		String str2=req.getParameter("designation");
		
		String ag=req.getParameter("age");
		int a =Integer.parseInt(ag);
		String s=req.getParameter("salary");
		double b=Double.parseDouble(s);
		String s2=req.getParameter("id");
		int c=Integer.parseInt(s2);
		employeeInfoBean.setAge(a);
		
		employeeInfoBean.setEmp_id(c);
		
		employeeInfoBean.setSalary(b);
		
		employeeInfoBean.setEmp_name(str);
		//String designation;
		employeeInfoBean.setDesignation(str2);

PrintWriter out=resp.getWriter();
out.println("<html>");
out.println("<body>");
if(daoImple.addEmployee(employeeInfoBean)) {
	out.println("<h2>Employee added successfully...</h2>");
}else {
	out.println("<h2>Employee not added...</h2>");
}
out.println("</body>");
out.println("</html>");
		}

}
