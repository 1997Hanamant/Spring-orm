package com.xworkz.nirmala.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.entity.NirmalaEntity;

@Component
public class NirmalaDAOImpl implements NirmalaDAO {
	@Autowired
	EntityManagerFactory factory;
	EntityManager manager = null;

	public Boolean save(NirmalaEntity nirmalaEntity) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(nirmalaEntity);
			transaction.commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return null;
	}

	public NirmalaEntity findById(Integer id) {
		try {
			manager = factory.createEntityManager();
			NirmalaEntity entity = manager.find(NirmalaEntity.class, id);
			if (entity != null) {
				System.out.println("Entity is found" + id);
				return entity;
			} else {
				System.out.println("Entity nit is found");

			}
		} catch (Exception e) {
			e.getMessage();
		} finally {
			manager.close();

		}
		return null;
	}

	public void updategenderAndTypeById(String gender, String type, Integer id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			NirmalaEntity entity = manager.find(NirmalaEntity.class, id);
			if (entity != null) {
				entity.setGender(gender);
				entity.setType(type);
				manager.merge(entity);
			} else {
				System.out.println("Entity is not found");
			}
			transaction.commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			manager.close();
		}

	}

	

	public void deleteNameById( Integer id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			NirmalaEntity findEntity = manager.find(NirmalaEntity.class, id);
			if (findEntity != null) {
				manager.remove(findEntity);
			} else {
				System.out.println("Entity is not found");
			}
			transaction.commit();
		}

		catch (Exception e) {
			e.getMessage();
		} finally {
			manager.close();
		}

		
	}
}
