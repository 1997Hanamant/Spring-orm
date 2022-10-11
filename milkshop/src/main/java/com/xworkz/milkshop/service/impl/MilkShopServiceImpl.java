package com.xworkz.milkshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;
@Service
public class MilkShopServiceImpl implements MilkShopService{
	@Autowired
	private MilkShopDAO shopDAO; 

	@Override
	public boolean validateAndSave(MilkShopDTO milkShopDTO) {
		System.out.println("Created"+this.getClass().getSimpleName());
		System.out.println("MilkShopDAO"+shopDAO.toString());
		return true;
	}

}
