package com.dev.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.dto.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwordServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

EmployeeInfoBean emp=new EmployeeInfoBean();
emp.setAge(1);
emp.setDesignation("ttt");
emp.setEmp_id(1111);
emp.setEmp_name("djhaksdh");
emp.setSalary(268381);
req.setAttribute("employee", emp);
RequestDispatcher dispatcher=req.getRequestDispatcher("/welcome.html");
dispatcher.forward(req, resp);
}//end of doget()
}//end of class
