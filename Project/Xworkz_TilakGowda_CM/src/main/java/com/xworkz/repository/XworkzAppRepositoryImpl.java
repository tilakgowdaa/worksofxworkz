package com.xworkz.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.XworkzAppEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class XworkzAppRepositoryImpl implements XworkzAppRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public XworkzAppRepositoryImpl() {
		log.info("Running XworkzAppRepositoryImpl");
	}

	@Override
	public long emailCount() {
		log.info("Running emailCount");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findEmailCount");
		Object object = query.getResultList();
		long no = (long) object;
		return no;
	}

	@Override
	public long userIdCount() {
		log.info("Running emailCount");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createNamedQuery("findUserIdCount");
		query.setParameter("user", query);
		Object obj=query.getSingleResult();
		long no=(long)obj;
		return no;
	}
	
	@Override
	public long mobileCount() {
		log.info("Running mobileCount");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createNamedQuery("findMobileCount");
		Object obj=query.getSingleResult();
		long no=(long)obj;
		
		return no;
	}

	@Override
	public boolean save(XworkzAppEntity xworkzAppEntity) {
		log.info("Running save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(xworkzAppEntity);
		transaction.commit();
		entityManager.close();
		return true;
	}

}
