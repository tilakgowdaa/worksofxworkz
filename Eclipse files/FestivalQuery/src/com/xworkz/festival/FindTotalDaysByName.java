package com.xworkz.festival;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotalDaysByName {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotalDaysByName");
		query.setParameter("name", "navrati");
		int date = (int) query.getSingleResult();
		System.out.println(date);
		manager.close();

	}

}
