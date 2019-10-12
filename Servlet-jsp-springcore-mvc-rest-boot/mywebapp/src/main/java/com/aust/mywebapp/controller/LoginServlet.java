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
import com.ust.dto.EmployeeInfoBean;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");

		EmployeeDeo dao=new EmployeeDaoImple();
		EmployeeInfoBean bean=dao.login(Integer.parseInt(id), password);
		String url=null;
		if (bean!=null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			url = "/home.jsp";
		}else {
			url="/login.jsp";
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
}
