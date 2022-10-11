package com.xworkz.country.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.country.dto.CountryDTO;

@Component
@RequestMapping("/")
public class CountryDisplayController {
	public CountryDisplayController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/display.do")
	public String display(CountryDTO countryDTO) {

		System.out.println("Calling Display Method");
		System.out.println("CountryDTO" + countryDTO);
		return "index.jsp";

	}
}
