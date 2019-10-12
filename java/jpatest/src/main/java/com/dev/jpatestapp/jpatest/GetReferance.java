package com.dev.jpatestapp.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Movie;

public class GetReferance {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction etr = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			etr = em.getTransaction();
			etr.begin();
			// Movie movie=em.getReference(Movie.class, 4); //same as find but it is not
			// heating the database if not use any data member
			Movie movie = em.find(Movie.class, 4); // it is heating the database if not use any data member
			System.out.println(movie.getId());
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(movie.getClass());

			etr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			etr.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
