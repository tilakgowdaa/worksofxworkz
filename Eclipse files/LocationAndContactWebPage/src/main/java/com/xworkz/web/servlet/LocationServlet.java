package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String start = req.getParameter("start");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(start);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span style='color:green;'/>");
		writer.print("<h1>This is the response to location web page<h1/>");
		if(name.length()>2) {
			writer.print("<h2 style='color:blue;'>The entered details <h2/>"+name+" "+email+" "+"<h2 style='color:blue;'>sent sucessfully<h2/>");
		}else {
			writer.print("<h3 style='color:red;'>Data entered is invalid<h3/> ");
			writer.print("<br><a href='index.html'>Home Page<a/><br/>");
		}
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
