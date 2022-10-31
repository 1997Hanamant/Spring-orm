package com.xworkz.bars.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bars.dao.BarsDAO;
import com.xworkz.bars.dto.BarsDTO;
@Repository
public class BarsDAOImpl implements BarsDAO {
	@Autowired
	private EntityManagerFactory factory;
	
	private EntityManager manager=null;

	@Override
	public Boolean save(BarsDTO barsDTO) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(barsDTO);
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

	@Override
	public List<BarsDTO> findAll() {
		try {
			manager=factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<BarsDTO> resultList = query.getResultList();
			if(resultList!=null) {
				return resultList;
			}
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public List<BarsDTO> findByName(String name) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			List<BarsDTO> resultList = query.getResultList();
			if(resultList!=null) {
				return resultList;
			}
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findFileNameByPriceAndLocation(Double price, String location) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findFileNameByPriceAndLocation");
			query.setParameter("pr", price);
			query.setParameter("lo", location);
			Object object = query.getSingleResult();
			if(object!=null) {
				String string=(String)object;
				return string;
			}
			
			
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

}
