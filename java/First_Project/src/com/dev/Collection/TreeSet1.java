package com.dev.Collection;
import java.util.TreeSet;

import com.dev.Encapsulation.Dog;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Dog> ts=new TreeSet<Dog>();
		Dog d=new Dog();
		d.setAge(3);
		d.setColor("black");
		d.setBreed("D M");
		d.setName("shiro");

		Dog d1=new Dog();
		d1.setAge(6);
		d1.setBreed("Dalmation");
		d1.setColor("white");
		d1.setName("ronnie");

		Dog d2=new Dog();
		d2.setAge(5);
		d2.setBreed("Dalmation");
		d2.setColor("white&White");
		d2.setName("ronnie");

		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		System.out.println(ts);
	}

}
