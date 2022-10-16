package com.xworkz.milkshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.DressDAO;
import com.xworkz.milkshop.dto.DressDTO;
import com.xworkz.milkshop.service.DressService;
@Service
public class DressServiceImpl implements DressService {
	@Autowired
	private DressDAO dressDAO;

	@Override
	public boolean validateAndSave(DressDTO dressDTO) {
		System.out.println("Created "+this.getClass().getSimpleName());
		dressDAO.save(dressDTO);
		return true;
	}

}
