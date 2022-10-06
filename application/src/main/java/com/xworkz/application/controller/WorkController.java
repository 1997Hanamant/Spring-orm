package com.xworkz.application.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/")
public class WorkController {

	public WorkController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/operation.do")
	public  ModelAndView onClick(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Calling on click method");
		ModelAndView modelAndView=new ModelAndView();
		String name = req.getParameter("ApplicantName");
		String company = req.getParameter("ApplicantCompany");
		String year = req.getParameter("ApplicantYear");
		String version = req.getParameter("ApplicantVersion");
		String size = req.getParameter("ApplicantSize");
		String technology = req.getParameter("ApplicantTechnology");

		System.out.println(name);
		System.out.println(company);
		System.out.println(year);
		System.out.println(version);
		System.out.println(size);
		System.out.println(technology);

		req.setAttribute("Name", name);
		req.setAttribute("Company", company);
		req.setAttribute("Year", year);
		req.setAttribute("Version", version);
		req.setAttribute("Size", size);
		req.setAttribute("Technology", technology);
		

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		try {
			requestDispatcher.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		List<Object>list=new ArrayList<Object>();
//		list.add(name);
//		list.add(company);
//		list.add(year);
//		list.add(version);
//		list.add(size);
//		list.add(technology);
//		System.out.println(list);
		
		modelAndView.addObject("Name", name);
		modelAndView.addObject("Company", company);
		modelAndView.addObject("Year", year);
		modelAndView.addObject("Version", version);
		modelAndView.addObject("Size", size);
		modelAndView.addObject("Technology", technology);
		
		modelAndView.setViewName("DisplayAll.jsp");
		return modelAndView;
	}

//	@RequestMapping("/nothing.do")
//	public String success() {
//		System.out.println("Calling success method ");
//		return "Success.jsp";
//	}

	@RequestMapping("/even.do")
	public String DisplayAll() {
		System.out.println("Calling DisplayAll method");
		return "DisplayAll.jsp";
	}
}
