package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/yellow")
public class YellowMoonServlet extends HttpServlet{
	
	public YellowMoonServlet() {
      System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling Yellow MoonServlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='yellow'><p>Welcome to web Project</p></body></html>");
		
	}

}
