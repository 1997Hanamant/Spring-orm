package com.xworkz.criminals.service;

import java.util.List;

import com.xworkz.criminals.dto.CriminalsDTO;

public interface CriminalService {
	
	boolean validateAndSave(CriminalsDTO criminalsDTO);
	
	List<CriminalsDTO> findAll();
	
	List<CriminalsDTO> validateFindByName(String name);
	
	List<CriminalsDTO> validateAndfindByGenderCountryAndCriminalType(String gender, String country, String criminlaType);

	List<Object[]> validateFindAllWifeNameAndPrisonName();
}
