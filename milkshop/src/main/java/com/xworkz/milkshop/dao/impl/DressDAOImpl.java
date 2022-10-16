package com.xworkz.milkshop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.DressDAO;
import com.xworkz.milkshop.dto.DressDTO;
@Repository
public class DressDAOImpl implements DressDAO {
	
     @Autowired
	private EntityManagerFactory factory;
	EntityManager manager=null;
	@Override
	public boolean save(DressDTO dressDTO) {
		
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dressDTO);
			transaction.commit();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			
		}
		return true;
	}

}
