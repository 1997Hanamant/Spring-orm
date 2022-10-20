package com.xworkz.criminals.dao;

import java.util.List;

import com.xworkz.criminals.dto.CriminalsDTO;

public interface CriminalDAO {
	boolean save(CriminalsDTO criminalsDTO);

	List<CriminalsDTO> findAll();

	List<CriminalsDTO> findByName(String name);

	List<CriminalsDTO> findByGenderCountryAndCriminalType(String gender, String country, String criminlaType);

}
