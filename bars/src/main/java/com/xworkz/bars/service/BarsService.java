package com.xworkz.bars.service;

import java.util.List;

import com.xworkz.bars.dto.BarsDTO;

public interface BarsService {

	Boolean validateAndSave(BarsDTO barsDTO);
	
	List<BarsDTO> validAndfindAll();
	
	List<BarsDTO>validateAndFindByName(String name);
	
	 String ValidateAndFindFileNameByPriceAndLocation(Double price,String location);
}
