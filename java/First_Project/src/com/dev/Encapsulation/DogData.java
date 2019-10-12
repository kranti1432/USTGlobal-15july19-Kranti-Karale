package com.dev.Encapsulation;

public class DogData {

	public static void main(String[] args) {
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		
		Cats c1=new Cats();
		Cats c2=new Cats();
		Cats c3=new Cats();

		d1.setAge(1);
		d1.setBreed("Dober Man");
		d1.setColor("black");
		d1.setName("Shiro");
		
		
		d2.setAge(2);
		d2.setBreed("German Shepherd");
		d2.setColor("brown");
		d2.setName("Sprike");
		
		
		d3.setAge(3);
		d3.setBreed("German Shepherd");
		d3.setColor("black&brown");
		d3.setName("Abby");
		
		c1.setAge(3);
		c1.setColor("white");
		c1.setName("mau");
		
		c2.setAge(1);
		c2.setColor("black");
		c2.setName("baby");
		
		c3.setAge(2);
		c3.setColor("white&black");
		c3.setName("pinky");
		
		Cats [] cat = {c1,c2,c3};
		
		for(int i=0;i<cat.length;i++) {
			System.out.println("cat no: "+(i+1));
			System.out.println("age : "+cat[i].getAge());
			System.out.println("name : "+cat[i].getName());
			System.out.println("color : "+cat[i].getColor());
			System.out.println("---------------------------------");
			
		}
		
		Dog [] dogs= {d1,d2,d3};
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println("Dog no: "+(i+1));
			System.out.println("age ; "+dogs[i].getAge());
			System.out.println("name ; "+dogs[i].getName());
			System.out.println("color ; "+dogs[i].getColor());
			System.out.println("breed ; "+dogs[i].getBreed());
			System.out.println("---------------------------------");

		}
		
		
	}

}
