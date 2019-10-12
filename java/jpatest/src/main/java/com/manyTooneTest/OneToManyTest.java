package com.manyTooneTest;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.OneToMany.dto.Pencil;
import com.OneToMany.dto.PencilBox;

public class OneToManyTest {
public static void main(String[] args) {
	EntityManagerFactory entitymanagerfactory=null;
	EntityManager entitymanager=null;
	EntityTransaction transaction=null;
	
	
	PencilBox pencilb=new PencilBox();
	pencilb.setBox_name("natraj");
	pencilb.setBox_no(2);
	
	Pencil pencil=new Pencil();
	pencil.setName("natraj111");
	pencil.setP_id(444);
	
	Pencil pencil1=new Pencil();
	pencil1.setName("natraj222");
	pencil1.setP_id(555);
	
	Pencil pencil2=new Pencil();
	pencil2.setName("natraj333");
	pencil2.setP_id(666);
	
		entitymanagerfactory=Persistence.createEntityManagerFactory("TestPersistence");
		entitymanager=entitymanagerfactory.createEntityManager();
		transaction=entitymanager.getTransaction();
		ArrayList<Pencil> ar=new ArrayList<Pencil>();
		ar.add(pencil2);
		ar.add(pencil1);
		
ar.add(pencil);
pencilb.setPencil(ar);
transaction.begin();

entitymanager.persist(pencilb);
System.out.println("saved");
transaction.commit();
	
		

	
}


}
