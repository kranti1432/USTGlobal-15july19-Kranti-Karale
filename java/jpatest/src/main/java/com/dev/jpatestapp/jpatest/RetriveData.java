package com.dev.jpatestapp.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Movie;

public class RetriveData {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();

		EntityTransaction tr=em.getTransaction();
		tr.begin();
		Movie movie = em.find(Movie.class, 4);
		System.out.println(movie.getId());
		System.out.println(movie.getName());
		System.out.println(movie.getRating());

	}

}
