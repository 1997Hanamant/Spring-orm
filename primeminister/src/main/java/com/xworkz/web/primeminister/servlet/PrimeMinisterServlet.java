package com.xworkz.web.primeminister.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/minister")
public class PrimeMinisterServlet extends HttpServlet {
	
	public PrimeMinisterServlet() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling DoPost Method");
		String name = req.getParameter("PrimeMinistername");
		String country = req.getParameter("PrimeMinisterCountry");
		String marriage = req.getParameter("Marriage");
		String partyName = req.getParameter("PartyName");
		String age = req.getParameter("PrimeMinisterAge");
		String period = req.getParameter("PrimeMinisterPeriod");
		String time = req.getParameter("Times Represented");
		
		System.out.println("name:"+name);
		System.out.println("country:"+country);
		System.out.println("marriage:"+marriage);
		System.out.println("partyName:"+partyName);
		System.out.println("age:"+age);
		System.out.println("period:"+period);
		System.out.println("time:"+time);
		
		
		
		req.setAttribute("Name", name);
		req.setAttribute("Country", country);
		req.setAttribute("Marriage", marriage);
		req.setAttribute("PartyName", partyName);
		req.setAttribute("Age", age);
		req.setAttribute("Period", period);
		req.setAttribute("Time", time);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Success.jsp");
		requestDispatcher.forward(req, resp);
		
		
}
}