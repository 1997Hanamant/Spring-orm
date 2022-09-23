package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 8,urlPatterns = "/black")
public class BlackMoonServlet extends HttpServlet {
	
	public BlackMoonServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("BlackMoon servlet calling");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>\r\n"
				+ "    <head>\r\n"
				+ "\r\n"
				+ "    </head>\r\n"
				+ "    <body bgcolor=\"black\">\r\n"
				+ "        <h1 style=\"color: white\">Welcome to web Project</h1>\r\n"
				+ "\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}

}
