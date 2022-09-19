package com.xworkz.nirmala.dao;

import com.xworkz.nirmala.entity.NirmalaEntity;

public interface NirmalaDAO {
	Boolean save(NirmalaEntity nirmalaEntity);
	 NirmalaEntity findById(Integer id);
	 void updategenderAndTypeById( String gender,  String type,Integer id);
	 void deleteNameById(Integer id);

}
