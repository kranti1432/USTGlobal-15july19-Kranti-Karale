package com.dev.Collection;

import com.dev.Encapsulation.Dog;

public class DogData extends DogFromImpImplimentation {

	public static void main(String[] args) {
		DogFromImpImplimentation d=new DogFromImpImplimentation();
		
		Dog dog=new Dog ();
		dog.setAge(5);
		boolean c=d.add(dog);
		System.out.println(c);

	}

}
