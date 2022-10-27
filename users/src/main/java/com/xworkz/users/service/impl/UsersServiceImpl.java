package com.xworkz.users.service.impl;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.users.dao.UsersDAO;
import com.xworkz.users.dto.UsersDTO;
import com.xworkz.users.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDAO usersDAO;
	
	public UsersServiceImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public Boolean validateAndSave(UsersDTO usersDTO) {
		System.out.println("Calling validateAndSave Method");
		
         ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         Validator validator = factory.getValidator();
         Set<ConstraintViolation<UsersDTO>> validate = validator.validate(usersDTO);
         if(validate.size()>0) {
        	 System.out.println("InValid");
         }
         else {
        	 System.out.println("Valid");
        	 return this.usersDAO.save(usersDTO);
         }
		
		
		return false;
	}

	@Override
	public List<UsersDTO> validateAndFindAll() {
		System.out.println("Calling ValidateAndFindAll");
		return this.usersDAO.findAll();
	}

	@Override
	public List<UsersDTO> validateAndFindByUserName(String userName) {
		System.out.println("Calling ValidateAndFindByName");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<String>> validate = validator.validate(userName);
		if(validate.size()>0) {
			System.out.println("Finding Name is InValid");
		}
		else {
			System.out.println("Finding Name is Valid");
			return this.usersDAO.findByUserName(userName);
			
		}
		return null;
	}

}
