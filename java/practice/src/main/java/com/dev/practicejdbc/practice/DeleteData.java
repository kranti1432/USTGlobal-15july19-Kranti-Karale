package com.dev.practicejdbc.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.practice.dto.EntityClass;

public class DeleteData {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction etr=null;
		
		try {
			emf=Persistence.createEntityManagerFactory("TestPersistence1");
			em=emf.createEntityManager();
			etr=em.getTransaction();
			etr.begin();
			EntityClass ec=em.find(EntityClass.class, 3);
			em.remove(ec);
			System.out.println("deleted");
			etr.commit();
		} catch (Exception e) {
			etr.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
