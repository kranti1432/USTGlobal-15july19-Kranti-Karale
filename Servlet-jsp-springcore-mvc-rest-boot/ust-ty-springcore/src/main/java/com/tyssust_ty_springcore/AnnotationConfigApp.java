package com.tyssust_ty_springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyssust_ty_springcore.beans.Animal;
import com.tyssust_ty_springcore.beans.HellWord;
import com.tyssust_ty_springcore.config.BeanConfig;

public class AnnotationConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		HellWord obj =context.getBean(HellWord.class);
		System.out.println(obj.getCount());
		System.out.println(obj.getMsg());
		System.out.println(obj.getMap());
		obj.getAnimal().makeSound();
		
		Animal animal=(Animal) context.getBean("dog");
		Animal animal2=(Animal) context.getBean("dog");
		System.out.println(animal==animal2);
		
		Animal animal3=(Animal) context.getBean("human");
		Animal animal4=(Animal) context.getBean("human");
		System.out.println(animal3==animal4);
		
		context.close();
	}

}
