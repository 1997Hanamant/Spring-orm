package com.xworkz.milkshop.dao.impl;

import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
@Repository
public class MilkShopDAOimpl implements MilkShopDAO {
	
	public MilkShopDAOimpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(MilkShopDTO milkShopDTO) {
		System.out.println("created"+this.getClass().getSimpleName());
		return true;
	}

}
