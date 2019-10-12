package com.dev.jpatestapp.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Movie;

public class Reattaching {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		try {
			EntityTransaction tr=em.getTransaction();
			tr.begin();
			Movie movie = em.find(Movie.class, 4);
			System.out.println(movie.getId());
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(em.contains(movie));
			em.detach(movie);
			System.out.println(em.contains(movie));
			movie.setName("dil hai tumhara");
			Movie movie1=em.merge(movie);
			System.out.println(em.contains(movie1));
			
			tr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			em.close();
		}
	}

}
