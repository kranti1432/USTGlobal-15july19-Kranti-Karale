package com.dev.servelet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	String path="/myfirstservlet";
	out.println("</html>");
	
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<body>");
	out.println("<h3>this is from my servlet</h3>");
	RequestDispatcher dispa=req.getRequestDispatcher(path);
	dispa.include(req, resp);
	out.println("<h3>this is include servlet</h3>");
	out.println("</body>");
	

}
}
