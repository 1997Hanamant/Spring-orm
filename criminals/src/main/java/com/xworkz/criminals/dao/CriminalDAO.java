package com.xworkz.criminals.dao;

import java.util.List;

import com.xworkz.criminals.dto.CriminalsDTO;

public interface CriminalDAO {
	boolean save(CriminalsDTO criminalsDTO);
	
	List<CriminalsDTO> findAll();

}
