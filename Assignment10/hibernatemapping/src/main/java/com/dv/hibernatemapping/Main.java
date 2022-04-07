package com.dv.hibernatemapping;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Cart Divya = new Cart();
		Item item = new Item();
		item.setCategory("Flute");
		item.setId(1);
		item.setPrize(10000);
		item.setProdName("BTS");
		item.setCart(Divya);
		Item item1 = new Item();
		item1.setCategory("Gitor");
		item1.setId(2);
		item1.setPrize(20000);
		item1.setProdName("BTS");
		item1.setCart(Divya);
		Divya.setItem(Arrays.asList(item, item1));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Shopping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(Divya);
		transaction.commit();
	}
}
