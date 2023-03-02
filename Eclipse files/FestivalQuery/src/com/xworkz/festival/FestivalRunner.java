package com.xworkz.festival;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FestivalRunner {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		FestivalEntity entity = new FestivalEntity("Ugadi", "Hindu", 5, "Paysa", "Chandra");
		FestivalEntity entity1 = new FestivalEntity("shivrati", "india", 1, "laadu", "shiva");
		FestivalEntity entity2 = new FestivalEntity("holi", "india", 1, "jalebi", "kamnaRaja");
		FestivalEntity entity3 = new FestivalEntity("ramNavami", "india", 1, "panka", "rama");
		FestivalEntity entity4 = new FestivalEntity("hanumanJayathi", "india", 1, "biscet", "hanuman");
		FestivalEntity entity5 = new FestivalEntity("guruPurnima", "panjab", 1, "holge", "chandra");
		FestivalEntity entity6 = new FestivalEntity("onam", "tamilNadu", 2, "pongal", "onamdevru");
		FestivalEntity entity7 = new FestivalEntity("raksha", "india", 1, "champakali", "bro");
		FestivalEntity entity8 = new FestivalEntity("nagPanchami", "karnataka", 1, "milk", "snake");
		FestivalEntity entity9 = new FestivalEntity("teej", "india", 1, "sweetMilk", "Chandra");
		FestivalEntity entity10 = new FestivalEntity("ganeshChaturthi", "india", 3, "modak", "ganesha");
		FestivalEntity entity11 = new FestivalEntity("gandhiJayanthi", "india", 1, "chocolate", "gandhi");
		FestivalEntity entity12 = new FestivalEntity("navrati", "india", 9, "holge", "durga");
		FestivalEntity entity13 = new FestivalEntity("dussehra", "karnataka", 1, "holge", "durga");
		FestivalEntity entity14 = new FestivalEntity("karvaChauth", "india", 1, "milk", "Chandra");
		FestivalEntity entity15 = new FestivalEntity("diwali", "india", 3, "barfi", "lakshmi");
		FestivalEntity entity16 = new FestivalEntity("childrenDay", "india", 1, "choco", "Childrens");
		FestivalEntity entity17 = new FestivalEntity("bhaiDooj", "india", 1, "kadabu", "bro");
		FestivalEntity entity18 = new FestivalEntity("eid", "muslims", 1, "sweetBiryani", "alla");
		FestivalEntity entity19 = new FestivalEntity("christmas", "world", 1, "cake", "jesus");
		FestivalEntity entity20 = new FestivalEntity("baisakhi", "panjab", 1, "sugarCane", "gurunan");
		FestivalEntity entity21 = new FestivalEntity("akshayaTritiya", "karnataka", 1, "gold", "Chandra");
		FestivalEntity entity22 = new FestivalEntity("gudiPadwa", "maharashtra", 1, "paysa", "gudi");
		FestivalEntity entity23 = new FestivalEntity("lohri", "panjab", 1, "Paysa", "gurunan");
		FestivalEntity entity24 = new FestivalEntity("republicDay", "india", 1, "chocolates", "public");

		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);

		transaction.commit();
		manager.close();

	}

}
