package com.dev.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.servelet.dao.EmployeeDaoImple;
import com.dev.servelet.dao.EmployeeDeo;
import com.ust.dto.EmployeeInfoBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String empid=req.getParameter("id");
	String password=req.getParameter("pass");
	int id=Integer.parseInt(empid);
	
	EmployeeDeo dao= new EmployeeDaoImple();
	EmployeeInfoBean employeeInfoBean=dao.login(id, password);
	
	if(employeeInfoBean !=null) {
		HttpSession session=req.getSession();
		session.setAttribute("employeeInfo",employeeInfoBean);
		
		resp.sendRedirect("./homepage.html");
	}else {
		resp.sendRedirect("./loginform.html");
	}
	
}
}
