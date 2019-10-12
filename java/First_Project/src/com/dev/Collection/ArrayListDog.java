package com.dev.Collection;

import java.util.ArrayList;

import com.dev.Encapsulation.Dog;

public class ArrayListDog {

	public static void main(String[] args) {
ArrayList<Dog> ar=new ArrayList<Dog> (2); //size of arraylist we give 2 but we add 3 so its make internally no effect

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

ar.add(d);
ar.add(d1);
ar.add(d2);

System.out.println(ar);

ar.trimToSize();

System.out.println("size after trimToSize() : "+ar.size());
	}

}
