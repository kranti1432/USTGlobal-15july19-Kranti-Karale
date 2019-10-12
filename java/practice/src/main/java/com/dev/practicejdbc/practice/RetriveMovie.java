package com.dev.practicejdbc.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.practice.dto.EntityClass;




public class RetriveMovie {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		
			emf=Persistence.createEntityManagerFactory("TestPersistence1");
			em=emf.createEntityManager();
			EntityClass ec=em.find(EntityClass.class,2);
			System.out.println(ec.getHero());
			System.out.println(ec.getId());
			System.out.println(ec.getName());

			
		
		
		
	}
}
