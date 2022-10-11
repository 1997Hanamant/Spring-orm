package com.xworkz.country.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CountryController {
	
	private Collection<String> list=new ArrayList<>();
	
	public CountryController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/country.do")
	public String onSave(Model model) {
		
		System.out.println("Calling Save Method");
		list.add("Hubli");
		list.add("Bagalkot");
		list.add("VijayPur");
		list.add("Dharwad");
		System.out.println(list);
		model.addAttribute("cities", list);
		return "index.jsp";
		
		
	}
	
}
