package com.xworkz.nirmala.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.entity.NirmalaEntity;

@Component
public class NirmalaServiceImpl implements NirmalaService {
	@Autowired
	NirmalaDAO nirmalaDAO;

	public Boolean validateAndSave(NirmalaEntity entity) {
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<NirmalaEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.err.println("Invalid");

		} else {
			System.out.println("valid");
			return nirmalaDAO.save(entity);
		}

		return false;
	}

	public NirmalaEntity validateAndFindById(Integer id) {
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<Integer>> validate = validator.validate(id);
		if (validate.size() > 0) {
			System.err.println("Invalid");
		} else {
			System.out.println("Valid");
			return nirmalaDAO.findById(id);
		}
		return null;
	}

	public void updategenderAndTypeById(String gender, String type, Integer id) {
		if (gender != null && gender.length() > 0 && gender.length() < 50) {
			if (type != null && type.length() > 0 && type.length() < 50) {
				System.out.println("updategenderAndTypeById is valid");
			}
		} else {
			System.out.println("updategenderAndTypeById is not valid");
			// this.nirmalaDAO.updategenderAndTypeById(gender, type, id);
		}
		this.nirmalaDAO.updategenderAndTypeById(gender, type, id);

	}

	public void deleteNameById( Integer id) {
		this.nirmalaDAO.deleteNameById(id);

	}
}
