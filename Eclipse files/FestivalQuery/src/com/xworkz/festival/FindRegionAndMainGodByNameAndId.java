package com.xworkz.festival;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query.setParameter("name", "republicDay");
		query.setParameter("id", 28);
		Object object = query.getSingleResult();
		Object[]array=(Object[])object;
		System.out.println(array[0]);
		System.out.println(array[1]);
		manager.close();
	}

}
