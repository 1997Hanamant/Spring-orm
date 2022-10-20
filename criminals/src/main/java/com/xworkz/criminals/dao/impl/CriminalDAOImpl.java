package com.xworkz.criminals.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminals.dao.CriminalDAO;
import com.xworkz.criminals.dto.CriminalsDTO;

@Repository
public class CriminalDAOImpl implements CriminalDAO {
	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager = null;

	@Override
	public boolean save(CriminalsDTO criminalsDTO) {

		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalsDTO);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<CriminalsDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CriminalsDTO> resultList = query.getResultList();
			return resultList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return findAll();
	}

	@Override
	public List<CriminalsDTO> findByName(String name) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("na", name);
			List<CriminalsDTO> resultList = query.getResultList();
			if (resultList != null) {
				return resultList;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public List<CriminalsDTO> findByGenderCountryAndCriminalType(String gender, String country, String criminlaType) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByAgeCountryAndCriminalType");
			query.setParameter("gn", gender);
			query.setParameter("co", country);
			query.setParameter("cr", criminlaType);
			List<CriminalsDTO> resultList = query.getResultList();
			if (resultList != null) {
				return resultList;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

}
