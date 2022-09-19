package com.xworkz.nirmala.service;

import com.xworkz.nirmala.entity.NirmalaEntity;

public interface NirmalaService {
	Boolean validateAndSave(NirmalaEntity entity);
	 NirmalaEntity validateAndFindById(Integer id);
	 void updategenderAndTypeById( String gender,  String type,Integer id);
	 void deleteNameById(Integer id);

}
