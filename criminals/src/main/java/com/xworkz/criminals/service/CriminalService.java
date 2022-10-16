package com.xworkz.criminals.service;

import java.util.List;

import com.xworkz.criminals.dto.CriminalsDTO;

public interface CriminalService {
	
	boolean validateAndSave(CriminalsDTO criminalsDTO);
	
	List<CriminalsDTO> findAll();

}
