package com.xworkz.users.dao;

import java.util.List;

import com.xworkz.users.dto.UsersDTO;

public interface UsersDAO {
	
	Boolean save(UsersDTO usersDTO);

	List<UsersDTO> findAll();
	
	List<UsersDTO> findByUserName(String userName);
}
