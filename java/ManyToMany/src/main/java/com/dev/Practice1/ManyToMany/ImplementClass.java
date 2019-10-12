package com.dev.Practice1.ManyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.many.dto.Student;
import com.many.dto.University;

/**
 * Hello world!
 *
 */
public class ImplementClass implements MethodForImplementation 
{
	static EntityManagerFactory emf=null;
	static EntityManager em=null;
	static EntityTransaction etr=null;
    public static void main( String[] args )
    {
        ArrayList<University> uni=new ArrayList<University>(); 
        ArrayList<Student> stu=new ArrayList<Student>(); 
    }

	public boolean addInformationUniversity(University university) {
		emf=Persistence.createEntityManagerFactory("Practice");
		em=emf.createEntityManager();
		etr=em.getTransaction();
		etr.begin();
		
		
		/*
		 * try { University university1=new University(); university1.setRank(0);
		 * university1.setUniversity_id(0); university1.setUniversity_name(null);
		 * university1.setStudent(null); etr.begin(); em.persist(university);
		 * System.out.println("University Info Added"); etr.commit(); } catch (Exception
		 * e) { etr.rollback(); e.printStackTrace(); }finally { em.close(); }
		 */
		
		
		return true;
	}

	public boolean removeUniversity(University university) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean findUniversity(String University, int priKey) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addInformationStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean findStudent(String Student, int priKey) {
		// TODO Auto-generated method stub
		return false;
	}
}
