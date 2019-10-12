package com.dev.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/myfirstservlet") // name of url
public class MyFirstServelet extends HttpServlet {
	
	/*
	 * public MyFirstServelet() { System.out.println("instantiation");
	 * System.out.println("distroy"); }
	 * 
	 * @Override public void init() throws ServletException {
	 * System.out.println("init"); }
	 * 
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { System.out.println("service"); }
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1"); // similar to html http-equi commented lines
		PrintWriter out = resp.getWriter();
		out.println("<html>");

		/*
		 * out.println("<head>");
		 * out.println("<meta http-equiv=\"refresh\" content=\"1\">");
		 * out.println("</head>");
		 */

		out.println("<body>");
		out.println("<h2> current system Date and time <br/>");
		out.println(date);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		// super.doGet(req, resp);
	}
}
