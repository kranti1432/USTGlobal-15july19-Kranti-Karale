package com.tyssust_ty_springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component("dog")
public class Dog implements Animal{

	public static void main(String[] args) {
		

	}
	public Dog() {
		System.out.println("dog object created");
	}
	@PostConstruct
	public void init() {
		System.out.println("dog init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("dog destroy method");
	}

	@Override
	public void makeSound() {
		System.out.println("Booooooooo..........");
		
	}
	
}
