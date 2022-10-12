package com.xworkz.fire.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/cycle")
public class LifeCycleServlet extends HttpServlet {
	
	public LifeCycleServlet() {
		System.out.println(this.getClass().getSimpleName()+"Created");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Intilaztion of servlet throug init()");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Intilaztion of servlet throug paramter init()");
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method is calling");
	}
	
	@Override
	public void destroy() {
	System.out.println("Destroy the servelt");
	}

}
