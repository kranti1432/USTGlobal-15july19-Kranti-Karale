package com.dev.JPQL;

import java.util.List;
import java.util.Scanner;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc=new Scanner(System.in);

		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

		entityManager = entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		String jpql = "from Movie";
		javax.persistence.Query query = entityManager.createQuery(jpql);
		List<Movie> resultList = query.getResultList();
		for (Movie movie : resultList) {

			System.out.println("id: " + movie.getId());
			System.out.println("name: " + movie.getName());
			System.out.println("rating: " + movie.getRating());
			System.out.println("*****************************");
		}
		// for getting name
		String jpql1 = "select name from Movie";
		query = entityManager.createQuery(jpql1);
		List<String> result = query.getResultList();
		for (String movie1 : result) {
			System.out.println("name is: " + movie1);
			System.out.println("------------------------------");
		}
		//for updating
		transaction.begin();
		String jpql2="update Movie set name=:name1 where id=:id1";
		query=entityManager.createQuery(jpql2);
		query.setParameter("name1", "hum tumhare hai");
		query.setParameter("id1",5);
		int movie2=query.executeUpdate();
		System.out.println(movie2);
		transaction.commit();
		
		
	}

}
