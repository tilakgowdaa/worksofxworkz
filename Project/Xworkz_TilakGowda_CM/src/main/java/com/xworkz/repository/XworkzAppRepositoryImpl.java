package com.xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.XworkzAppEntity;

@Repository
public class XworkzAppRepositoryImpl implements XworkzAppRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public XworkzAppRepositoryImpl() {
		System.out.println("Running XworkzAppRepositoryImpl");
	}

	@Override
	public List<XworkzAppEntity> findAll() {
		System.out.println("Running findUserEmailMobile");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findAll");
		List<XworkzAppEntity> entities = query.getResultList();
		return entities;
	}

	@Override
	public boolean save(XworkzAppEntity xworkzAppEntity) {
		System.out.println("Running save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(xworkzAppEntity);
		transaction.commit();
		entityManager.close();
		return true;
	}

}
