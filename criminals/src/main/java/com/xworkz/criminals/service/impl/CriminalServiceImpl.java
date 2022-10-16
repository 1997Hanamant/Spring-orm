package com.xworkz.criminals.service.impl;

import java.util.List;

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
}
