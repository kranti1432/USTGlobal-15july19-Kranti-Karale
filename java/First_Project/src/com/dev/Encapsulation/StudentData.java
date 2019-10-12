package com.dev.Encapsulation;

public class StudentData {


	public static void main(String[] args) {
		Student s=new Student();
		s.setRegno(2091273812);
		s.setName("kranti");
		s.setPassword("1432");
		s.setEmail("kranti@gmail.com");
		

		System.out.println("reg no.is= "+s.getRegno());
		System.out.println("reg no.is= "+s.getName());
		System.out.println("reg no.is= "+s.getEmail());
		//System.out.println("reg no.is= "+s.getPassword());    //no get method for password
		
		
		Student s1=new Student();
		s1.setRegno(111111);
		s1.setName("karale");
		s1.setPassword("14321432");
		s1.setEmail("kranti1432@gmail.com");

		System.out.println("reg no.is= "+s1.getRegno());
		System.out.println("reg no.is= "+s1.getName());
		System.out.println("reg no.is= "+s1.getEmail());



	}

}
