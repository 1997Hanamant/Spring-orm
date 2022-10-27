package com.xworkz.users.service;

import java.util.List;

import com.xworkz.users.dto.UsersDTO;

public interface UsersService {
	
	Boolean validateAndSave(UsersDTO usersDTO);

	List<UsersDTO> validateAndFindAll();
	
	List<UsersDTO> validateAndFindByUserName(String userName);
}


