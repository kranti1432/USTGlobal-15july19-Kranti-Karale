package com.dev.jpatestapp.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Movie;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager =null; 
		EntityTransaction transaction =null;
		Movie movie = new Movie();
		movie.setId(5);
		movie.setName("Dil");
		movie.setRating("awosome");
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Changes Saved");
			transaction.commit();
		}catch(Exception e) {

			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();

		}
	}
}
