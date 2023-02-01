package com.xworkz.webSeries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/series")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Created WebSeriesServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running inIt method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
		String name=req.getParameter("name");
		String Lang=req.getParameter("language");
		String episode=req.getParameter("episode");
		String ott=req.getParameter("ott");
		String butget=req.getParameter("budget");
		
		System.out.println("name");
		System.out.println("Lang");
		System.out.println("episode");
		System.out.println("ott");
		System.out.println("butget");
		
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue;'>");
		writer.print(name +" Data sent successfully");
		writer.print("<h1/>");
		writer.print("<body/>");
		writer.print("<html/>");
		resp.setContentType("text/plain");	
	}
	
	
}
