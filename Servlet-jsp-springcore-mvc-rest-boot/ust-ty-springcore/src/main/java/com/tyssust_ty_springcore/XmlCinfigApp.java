package com.tyssust_ty_springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyssust_ty_springcore.beans.Animal;
import com.tyssust_ty_springcore.beans.HellWord;
import com.tyssust_ty_springcore.beans.Pet;

public class XmlCinfigApp {

	public static void main(String[] args) {
		HellWord hellWord = new HellWord();
		hellWord.setMsg("hello world!!!!!!!!!");
		System.out.println(hellWord.getMsg());

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");// to connect beans.xml
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("beans.xml");//to connect beans.xml
		 */

		HellWord hellWord2 = context.getBean(HellWord.class);
		System.out.println(hellWord2.getMsg());
		System.out.println(hellWord2.getCount());
		// hellWord2.getAnimal().makeSound();// ref in property is human so output gives
		// from human
		System.out.println(hellWord2.getMap());

		/*
		 * System.out.
		 * println("output for animal interface which implemented by dog and human");
		 * //Animal animal=context.getBean(Animal.class); //when one implementation
		 * 
		 * Animal animal=(Animal) context.getBean("dog"); //more than one id we have to
		 * give seperate Animal animal2=(Animal) context.getBean("human");
		 * animal.makeSound(); animal2.makeSound();
		 */

		/*
		 * System.out.
		 * println("output for Pet pet contains contsructor with two arg string name and Animal object"
		 * ); Pet pet=context.getBean(Pet.class); System.out.println(pet.getName());
		 * pet.getAnimal().makeSound();
		 */
		context.close();

	}

}
