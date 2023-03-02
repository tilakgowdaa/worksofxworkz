package com.xworkz.festival;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByIdAndName {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		query.setParameter("name", "teej");
		query.setParameter("id", 13);
		Object object = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) object;
		System.out.println(entity);
		manager.close();
	}

}