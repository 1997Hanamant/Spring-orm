package com.xworkz.nirmala.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.nirmala.configuration.NiramlaConfiguration;
import com.xworkz.nirmala.entity.NirmalaEntity;
import com.xworkz.nirmala.service.NirmalaServiceImpl;

public class NiramalaRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NiramlaConfiguration.class);
		System.out.println(context);
		NirmalaServiceImpl bean = context.getBean(NirmalaServiceImpl.class);

		NirmalaEntity nirmalaEntity = new NirmalaEntity("BTM", "Male", "Public", 10.00D, LocalTime.now(), "Hanamant",
				LocalDate.now(), "Prajwal", LocalDate.now());
		NirmalaEntity nirmalaEntity1 = new NirmalaEntity("RR Nagar", "Female", "Private", 20.00D, LocalTime.now(), "Hanamant",
				LocalDate.now(), "Suhas", LocalDate.now());
		
		bean.validateAndSave(nirmalaEntity);
		bean.validateAndSave(nirmalaEntity1);
		NirmalaEntity validateAndFindById = bean.validateAndFindById(1);
		System.out.println(validateAndFindById);
		
		bean.updategenderAndTypeById("Female", "Private", 1);
		
		bean.deleteNameById(2);
		
	
		
	}

}
