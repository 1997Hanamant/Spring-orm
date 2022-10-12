package com.xworkz.fire.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/switch")
public class FireServlet extends HttpServlet {

	public FireServlet() {
		System.out.println(this.getClass().getSimpleName() + "is created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method is calling");
		
		
	String name=req.getParameter("alias");
	String company=req.getParameter("offer");
	String salary=req.getParameter("salary");
		System.out.println("name"+" "+name.concat(name));
		System.out.println("company"+" "+name.concat(company));
		System.out.println("salary"+" "+name.concat(salary));
		
		
		resp.setContentType("text/html");
	PrintWriter writer	=resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("this is working")
		.append("</h1>")
		.append("</br>")
		.append("name").append(name)
		.append("</br>")
		.append("company").append(company)
		.append("</br>")
		.append("salary").append(salary)
		.append("</body>")
		.append("</html>");	
		
		
	}

}
