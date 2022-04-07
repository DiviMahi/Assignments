package com.dv.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setName("Divya");
		emp.setDesg("Tester");
		Laptop lap = new Laptop(101, "Lenova");
		emp.setLap(lap);
		lap.setEmployee(emp);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(emp);
		em.persist(lap);

		transaction.commit();

	}

}