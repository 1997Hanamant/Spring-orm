package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.DressDTO;
import com.xworkz.milkshop.service.DressService;

@Controller
@RequestMapping("/Dress")
public class DressController {
	@Autowired
	private DressService dressService;
	
	public DressController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSave(DressDTO dressDTO) {
		System.out.println("Calling On save Method");
		System.out.println("DressDTO"+dressDTO);
		
		boolean validateAndSave = dressService.validateAndSave(dressDTO);
		if(validateAndSave) {
			System.out.println("Data is Valid and save");
			return "DisplaySuccess";
		}
	else {
		System.out.println("Data is Valid and save");
		return "index";
	}
		
	}

}
