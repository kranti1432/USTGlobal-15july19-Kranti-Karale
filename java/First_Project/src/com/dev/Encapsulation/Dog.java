package com.dev.Encapsulation;

public class Dog implements Comparable<Dog> {
	private int age;
	private String name;
	private String color;
	private String breed;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", color=" + color + ", breed=" + breed + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		return (this.age-d.age);
	}


}
