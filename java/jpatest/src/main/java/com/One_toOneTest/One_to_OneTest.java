package com.One_toOneTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.One_to_One.dto.Person;
import com.One_to_One.dto.VoterCard;

public class One_to_OneTest {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction transaction = null;

		Person person = new Person();
		person.setId(2);
		person.setName("yashu");
		person.setAge(6);

		VoterCard votercard = new VoterCard();
		votercard.setName("bbbb");
		votercard.setV_id(12444);
		person.setVotercard(votercard);

		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager = entitymanagerfactory.createEntityManager();
			transaction = entitymanager.getTransaction();
			transaction.begin();

			// for adding
			// entitymanager.persist(person);

			// for getting person info from voterCard
			VoterCard vc = entitymanager.find(VoterCard.class, 12333);
			System.out.println("name :" + vc.getPerson().getName());

			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entitymanager.close();
		}

	}

}
