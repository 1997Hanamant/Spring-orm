package com.xworkz.bars.dao;

import java.util.List;

import com.xworkz.bars.dto.BarsDTO;

public interface BarsDAO {
	
	Boolean save(BarsDTO barsDTO);
	
	 List<BarsDTO> findAll();
	 
	 List<BarsDTO> findByName(String name);
	 
	 String findFileNameByPriceAndLocation(Double price,String location);
}