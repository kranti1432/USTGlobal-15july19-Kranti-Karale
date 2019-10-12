package com.dev.practicejdbc.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.practice.dto.EntityClass;

public class UpdateMovie2 {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction etr=null;
		
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence1");
			em=emf.createEntityManager();
			etr=em.getTransaction();
			etr.begin();
			EntityClass ec=em.getReference(EntityClass.class, 1);
			ec.setHero("new set");
			System.out.println("updated");
			etr.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			etr.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
