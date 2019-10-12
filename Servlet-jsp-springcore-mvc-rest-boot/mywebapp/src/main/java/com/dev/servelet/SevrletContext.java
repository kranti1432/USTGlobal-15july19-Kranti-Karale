package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servContext")
public class SevrletContext extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context=getServletContext();
	String nameval=context.getInitParameter("myParam");
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	out.println("<h2> name in servContext is: "+nameval+"</h2>");
	out.println("</body>");
	out.println("</html>");
}
}
