package com.manyTomanyTest;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ManyToMany.dto.Course;
import com.ManyToMany.dto.Student;

public class ManyTomanyTest {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=null;
		EntityManager entitymanager=null;
		EntityTransaction transaction=null;

		Student student1=new Student();
		student1.setStudent_id(5);
		student1.setStudent_name("kranti");

		Student student2=new Student();
		student2.setStudent_id(6);
		student2.setStudent_name("yashu");

		Course c=new Course();
		c.setCourse_id(555);
		c.setCourse_name("java");
		Course c1=new Course();
		c1.setCourse_id(666);
		c1.setCourse_name("html");
		ArrayList<Course> ar=new ArrayList<Course>();
		ar.add(c);
		ar.add(c1);
		student1.setCourse(ar);
		student2.setCourse(ar);


		try {

			entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager=entitymanagerfactory.createEntityManager();
			transaction=entitymanager.getTransaction();
			transaction.begin();
			System.out.println("unidirectional");
			/*
			 * entitymanager.persist(student2); entitymanager.persist(student1);
			 */
			Course course=entitymanager.find(Course.class,555);
			System.out.println(course.getStudent());

			transaction.commit();

		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();
		}
	}
}
