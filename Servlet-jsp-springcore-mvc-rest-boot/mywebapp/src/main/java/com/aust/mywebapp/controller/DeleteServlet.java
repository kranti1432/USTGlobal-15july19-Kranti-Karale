package com.aust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.servelet.dao.EmployeeDaoImple;
import com.dev.servelet.dao.EmployeeDeo;
@WebServlet("/delete11")
public class DeleteServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	EmployeeDeo dao=new EmployeeDaoImple();
	dao.deleteEmployee(Integer.parseInt(id));
	
	HttpSession session=req.getSession(false);
	session.invalidate();
	
	//RequestDispatcher dis=req.getRequestDispatcher("/login.jsp");
	resp.sendRedirect("./login.jsp");
}
	
}
