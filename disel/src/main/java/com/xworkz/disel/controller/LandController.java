package com.xworkz.disel.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {

	public LandController() {
		System.out.println(this.getClass().getSimpleName() + "Default constructor");
	}

	@RequestMapping("/Click.do")
	public String onClick() {
		System.out.println("Calling onClick Function");
		return "index.jsp";
	}
}
