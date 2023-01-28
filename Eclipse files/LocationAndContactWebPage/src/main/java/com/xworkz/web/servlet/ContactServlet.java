package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
public ContactServlet() {
System.out.println("Created "+this.getClass().getSimpleName());
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comments=req.getParameter("comments");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);
		
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>This is the response for Contact web page<h1/>");
		if(mobile.length()==10) {
			writer.print("<h2>Entered data sent sucessfully<h2>");	
		}else {
			writer.print("<h2 style='color:red;'>Entered mobile no is invalid<h2/>");
			writer.print("<a href='index.html'>Home Page</a>");
		}
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	}
}
