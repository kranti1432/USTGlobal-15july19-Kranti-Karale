package com.dev.JPQL;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);

		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		System.out.println("enter movie name");
		String name1 = sc.nextLine();
		// String query="delete from Movie where name=:name1";
		Query query1 = entityManager.createQuery("delete from Movie where name=:name1");
		query1.setParameter("name1", name1);
		transaction.begin();
		int count = query1.executeUpdate();
		transaction.commit();
		System.out.println(count + " :deleted");
	}
}
