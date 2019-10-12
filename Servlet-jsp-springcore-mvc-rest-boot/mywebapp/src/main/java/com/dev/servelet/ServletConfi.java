package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfi extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletConfig config=getServletConfig();
	String nameval=config.getInitParameter("name");
	ServletContext context=getServletContext();
	String nameval1=context.getInitParameter("myParam");
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	out.println("<h2> name value in confi is: "+nameval+"</h2>");
	out.println("<h2> name value in context is: "+nameval1+"</h2>");
	out.println("</body>");
	out.println("<html>");
}//end of doGet()
}//end of class
