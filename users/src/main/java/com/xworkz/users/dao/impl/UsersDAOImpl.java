package com.xworkz.users.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.users.dao.UsersDAO;
import com.xworkz.users.dto.UsersDTO;

@Repository
public class UsersDAOImpl implements UsersDAO {
	@Autowired
	private EntityManagerFactory factory;

	private EntityManager manager = null;

	public UsersDAOImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Boolean save(UsersDTO usersDTO) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(usersDTO);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<UsersDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<UsersDTO> resultList = query.getResultList();
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
	public List<UsersDTO> findByUserName(String userName) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByUserName");
			query.setParameter("na", userName);
			List<UsersDTO> resultList = query.getResultList();
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
