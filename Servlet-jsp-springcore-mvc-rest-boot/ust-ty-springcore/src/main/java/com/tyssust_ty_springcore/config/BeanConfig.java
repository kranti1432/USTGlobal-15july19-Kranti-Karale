package com.tyssust_ty_springcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyssust_ty_springcore.beans.Animal;
import com.tyssust_ty_springcore.beans.Dog;
import com.tyssust_ty_springcore.beans.HellWord;
import com.tyssust_ty_springcore.beans.Human;

@Configuration
public class BeanConfig {
	@Bean(name = "obj") // ,autowire =Autowire.BY_TYPE
	public HellWord getHellWord() {
		HellWord hellWord = new HellWord();
		hellWord.setMsg("Hello World");
		hellWord.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		hellWord.setMap(map);
		Animal an = getDog();
		/*
		 * above and below line is same ..upcasting by confi dog Animal can getbean as
		 * dog implement animal no need to confi animal see in annotation congi class
		 * ..Animal animal=context.getBea
		 */
		// hellWord.setAnimal(getDog());
		return hellWord;
	}

	@Bean(name = "dog")
	// @Scope("prototype") //if scope is prototype object not destroy as created
	// outside spring container ...handled by garbage collector
	public Dog getDog() {
		return new Dog();
	}

	@Bean(name = "human")
	public Human getHuman() {
		return new Human();
	}
}
