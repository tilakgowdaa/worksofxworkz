package com.xworkz.kgf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class KGFServlet extends HttpServlet {
	public KGFServlet() {
		System.out.println("Created KGFServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
		String dir = req.getParameter("director");
		String hero = req.getParameter("hero");
		String heroNo = req.getParameter("hero no");
		String heroAge = req.getParameter("hero age");
		String heroine = req.getParameter("heroine");
		String heroineNo = req.getParameter("heroine no");
		String heroineAge = req.getParameter("heroine age");
		String mDir = req.getParameter("M director");
		String budget = req.getParameter("budget");
		String release = req.getParameter("release");
		String collection = req.getParameter("collection");
		String art = req.getParameter("art");
		String villain = req.getParameter("villain");
		String location = req.getParameter("location");
		String days = req.getParameter("days");
		String sequel = req.getParameter("sequel");
		String theater = req.getParameter("theater");
		String daysRan = req.getParameter("days ran");
		String result = req.getParameter("result");

		System.out.println(dir);
		System.out.println(hero);
		System.out.println(heroNo);
		System.out.println(heroAge);
		System.out.println(heroine);
		System.out.println(heroineNo);
		System.out.println(heroineAge);
		System.out.println(mDir);
		System.out.println(budget);
		System.out.println(release);
		System.out.println(collection);
		System.out.println(art);
		System.out.println(villain);
		System.out.println(location);
		System.out.println(days);
		System.out.println(sequel);
		System.out.println(theater);
		System.out.println(daysRan);
		System.out.println(result);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("KGF DETAILS SENT SUCESSFULLY");
		writer.print("<h1/>");
		writer.print("<body/>");
		writer.print("<html/>");
		resp.setContentType("text/html");

	}
}
