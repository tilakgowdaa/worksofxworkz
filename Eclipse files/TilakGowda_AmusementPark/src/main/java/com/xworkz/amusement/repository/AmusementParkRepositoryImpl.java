package com.xworkz.amusement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.amusement.entity.AmusementParkEntity;

@Repository
public class AmusementParkRepositoryImpl implements AmusementParkRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(AmusementParkEntity amusementParkEntity) {
		System.out.println("Running save method");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(amusementParkEntity);
		entityTransaction.commit();
		entityManager.close();
		return true;

	}

	@Override
	public AmusementParkEntity findBy(int id) {
		System.out.println("Running findBy");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AmusementParkEntity DB = entityManager.find(AmusementParkEntity.class, id);
		entityManager.close();
		return DB;
	}

	@Override
	public List<AmusementParkEntity> findBy(String name) {
		System.out.println("Running findBy");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("set", name);
			List<AmusementParkEntity> list = query.getResultList();
			System.out.println("Total list: " + list.size());
			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(AmusementParkEntity amusementParkEntity) {
		System.out.println("Running update");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(amusementParkEntity);
			transaction.commit();
			return true;
		} finally {
			entityManager.close();
		}

	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running delete");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		AmusementParkEntity del=entityManager.find(AmusementParkEntity.class, id);
		
		entityTransaction.begin();
		entityManager.remove(del);
		entityTransaction.commit();
		entityManager.close();

		return true;

	}

}
