package com.aust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.servelet.dao.EmployeeDaoImple;
import com.dev.servelet.dao.EmployeeDeo;
import com.ust.dto.EmployeeInfoBean;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher =req.getRequestDispatcher("/registerEmployee.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String salary=req.getParameter("salary");
		String designation=req.getParameter("designation");
		String password=req.getParameter("password");

		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		employeeInfoBean.setAge(Integer.parseInt(age));
		employeeInfoBean.setDesignation(designation);
		employeeInfoBean.setEmp_name(name);
		employeeInfoBean.setPassword(password);
		employeeInfoBean.setSalary(Double.parseDouble(salary));
		employeeInfoBean.setEmp_id(Integer.parseInt(id));
		
		EmployeeDeo dao=new EmployeeDaoImple();
		dao.registerEmployee(employeeInfoBean);
		
		RequestDispatcher dispatcher =req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
}
