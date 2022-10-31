package com.xworkz.bars.service.impl;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bars.dao.BarsDAO;
import com.xworkz.bars.dto.BarsDTO;
import com.xworkz.bars.service.BarsService;

@Service
public class BarsServiceImpl implements BarsService {
	@Autowired
	private BarsDAO barsDAO;

	@Override
	public Boolean validateAndSave(BarsDTO barsDTO) {

		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<BarsDTO>> validate = validator.validate(barsDTO);
		if (validate.size() > 0) {
			System.out.println("Data is not valid and not saved to DataBase");
		} else {
			System.out.println("Data is valid and saved to dataBase");
			return this.barsDAO.save(barsDTO);
		}
		return true;
	}

	@Override
	public List<BarsDTO> validAndfindAll() {
		System.out.println("Calling ValidAndFindAll method");
		return this.barsDAO.findAll();
	}

	@Override
	public List<BarsDTO> validateAndFindByName(String name) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<String>> validate = validator.validate(name);
		if (validate.size() > 0) {
			System.out.println("Name is not valid and  name not find in database");

		} else {
			System.out.println("Name is  valid and  name  find in database");
			return this.barsDAO.findByName(name);
		}
		return null;
	}

	@Override
	public String ValidateAndFindFileNameByPriceAndLocation(Double price, String location) {
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<Double>> validateProperty = validator.validateProperty(price, location);
		if(validateProperty.size()>0) {
			System.out.println("File name is not found");
		}
		else {
			System.out.println("File name is found");
			return this.barsDAO.findFileNameByPriceAndLocation(price, location);
		}
		return null;
	}

}
