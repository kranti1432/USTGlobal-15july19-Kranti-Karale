package com.dev.practicejdbc.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dev.practice.dto.EntityClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=null;
        EntityManager em=null;
        EntityTransaction etr=null;
        EntityClass ec=new EntityClass();
        ec.setId(3);
        ec.setHero("arjun rampal");
        ec.setName("dil hai tumhara");
        try {
			emf=Persistence.createEntityManagerFactory("TestPersistence1");
			em=emf.createEntityManager();
			etr=em.getTransaction();
			etr.begin();
			em.persist(ec);
			System.out.println("changes saved");
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
