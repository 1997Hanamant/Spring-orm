package com.xworkz.mansoon.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/monsoon")
public class MonsoonServlet extends HttpServlet{
	
	public MonsoonServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling Service method in monsoonServlet");
		resp.setContentType("text/html");
		String name = req.getParameter("alias");
		String companyName = req.getParameter("company name");
		String pacakage = req.getParameter("package");
	    String designation=req.getParameter("designation");
	    
	    System.out.println("name"+name);
	    System.out.println("companyName"+companyName);
	    System.out.println("pacakage"+pacakage);
	    System.out.println("designation"+designation);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("This is working on web project")
		.append("</h1>")
		.append("<br>")
		.append("name").append(name)
		.append("<br>")
		.append("companyName").append(companyName)
		.append("<br>")
		.append("pacakage").append(pacakage)
		.append("<br>")
		.append("designation").append(designation)
		.append("</body")
		.append("</html>");
	}

}
