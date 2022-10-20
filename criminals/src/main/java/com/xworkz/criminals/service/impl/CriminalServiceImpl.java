package com.xworkz.criminals.service.impl;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminals.dao.CriminalDAO;
import com.xworkz.criminals.dto.CriminalsDTO;
import com.xworkz.criminals.service.CriminalService;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalDAO criminalDAO;

	@Override
	public boolean validateAndSave(CriminalsDTO criminalsDTO) {
		System.out.println("Calling validateAndSave");
		if (criminalsDTO != null) {
			String name = criminalsDTO.getName();
			String wifeName = criminalsDTO.getWifeName();
			String rightHandName = criminalsDTO.getRightHandName();
			String leftHandName = criminalsDTO.getLeftHandName();
			String prsionName = criminalsDTO.getPrisonName();
			Double netWorth = criminalsDTO.getNetWorth();

			if (name.length() > 3 && name.length() < 30 && wifeName.length() > 3 && wifeName.length() < 30
					&& rightHandName.length() > 3 && rightHandName.length() < 30 && leftHandName.length() > 3
					&& leftHandName.length() < 30 && prsionName.length() > 3 && prsionName.length() < 30
					&& netWorth != 0) {
				return this.criminalDAO.save(criminalsDTO);

			} else {
				System.out.println("Data is Not valid");
			}
		}
		return false;
	}

	@Override
	public List<CriminalsDTO> findAll() {
		System.out.println("Calling FindAll Method From Service");
		List<CriminalsDTO> find = criminalDAO.findAll();
		return this.criminalDAO.findAll();
	}

	@Override
	public List<CriminalsDTO> validateFindByName(String name) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<String>> validate = validator.validate(name);
		if (validate.size() > 0) {
			System.out.println("Name is invalid");
		} else {
			System.out.println("Name is valid");
			return criminalDAO.findByName(name);
		}
		return null;
	}

	@Override
	public List<CriminalsDTO> validateAndfindByGenderCountryAndCriminalType(String gender, String country,
			String criminlaType) {
		if(gender.length()>3 & country.length()>3 && criminlaType.length()>3) {
			System.out.println("Gender Country And Criminal Type is Valid");
			return criminalDAO.findByGenderCountryAndCriminalType(gender, country, criminlaType);
		}
		
		else {
			System.out.println("Gender Country And Criminal Type is Notvalid");
			
		}
		return null;
	}

	



	

	}
