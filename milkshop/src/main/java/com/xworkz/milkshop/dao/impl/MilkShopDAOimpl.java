package com.xworkz.milkshop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkShopDAOimpl implements MilkShopDAO {
	
	@Autowired
	private EntityManagerFactory factory;
	
	EntityManager manager=null;
	
	public MilkShopDAOimpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	

	@Override
	public boolean Save(MilkShopDTO milkShopDTO) {
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(milkShopDTO);
			transaction.commit();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
			System.out.println("Exception is saved");
		}
		finally {
			manager.close();
			
		}
		return true;
	}

	

}
