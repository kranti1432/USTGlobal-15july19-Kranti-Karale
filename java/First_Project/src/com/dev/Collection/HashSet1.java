package com.dev.Collection;

import java.util.HashSet;

import com.dev.Encapsulation.Dog;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Dog> hs=new HashSet();

		Dog d=new Dog();
		d.setAge(6);
		d.setColor("black");
		d.setBreed("D M");
		d.setName("shiro");

		Dog d1=new Dog();
		d1.setAge(6);
		d1.setBreed("Dalmation");
		d1.setColor("white");
		d1.setName("ronnie");

		Dog d2=new Dog();
		d2.setAge(6);
		d2.setBreed("Dalmation");
		d2.setColor("white&White");
		d2.setName("ronnie");
		
		d.setAge(2); //update by set method
		d1.setAge(2);
		d2.setAge(5);

		boolean b=hs.add(d);
		boolean b1=hs.add(d1);
		boolean b2=hs.add(d2);
		System.out.println("output od add() : "+b +" "+ b1+" "+b2);
		System.out.println(hs);
		System.out.println("size of HashSet hs before remove : "+hs.size());

		boolean b3=hs.remove(d);
		System.out.println("output for remove() : "+b3);
		System.out.println(hs);

		System.out.println("output of contains() : "+hs.contains(d));
		
		System.out.println("size of HashSet hs after remove : "+hs.size());
		
		hs.clear();
		System.out.println("size of HashSet hs after clear : "+hs.size());
	}

}
