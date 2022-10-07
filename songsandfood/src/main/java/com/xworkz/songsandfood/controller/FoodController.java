package com.xworkz.songsandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.songsandfood.dto.FoodDTO;

@Component
@RequestMapping("/")
public class FoodController {
	private Collection<FoodDTO >foodDTOs=new ArrayList<FoodDTO>();
	
	public FoodController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/food.do")
	public String foodAdd(FoodDTO foodDTO,Model model) {
		System.out.println("Calling foodAdd");
		System.out.println("Fecthing FoodDto"+foodDTO);
		model.addAttribute("FoodDto", foodDTO);
		boolean add = foodDTOs.add(foodDTO);
	    int size = foodDTOs.size();
	    model.addAttribute("count", size);
		System.out.println(add);
		return "Food.jsp";
		
	}
	@RequestMapping("/foodDisplay.do")
	public String viewFood(Model model) {
		System.out.println("Calling viewFood");
		model.addAttribute("list", this.foodDTOs);
		return "DisplayFood.jsp";
		
	}
	

}
