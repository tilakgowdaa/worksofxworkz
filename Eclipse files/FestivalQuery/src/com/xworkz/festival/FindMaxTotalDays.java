package com.xworkz.festival;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxTotalDays {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxTotalDays");
		Object object = query.getSingleResult();
		int result = (int) object;
		System.out.println(result);
		manager.close();
	}

}
