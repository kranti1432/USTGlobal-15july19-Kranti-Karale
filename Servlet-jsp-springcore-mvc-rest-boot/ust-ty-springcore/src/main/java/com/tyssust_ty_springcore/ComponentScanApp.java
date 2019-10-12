package com.tyssust_ty_springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyssust_ty_springcore.beans.HellWord;
import com.tyssust_ty_springcore.config.SpringConfi;

public class ComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfi.class);
		HellWord hellWord = context.getBean(HellWord.class);
		hellWord.getAnimal().makeSound();
	}

}
