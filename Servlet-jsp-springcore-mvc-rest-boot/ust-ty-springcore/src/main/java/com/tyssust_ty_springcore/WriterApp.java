package com.tyssust_ty_springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyssust_ty_springcore.beans.Author;

public class WriterApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("author.xml");
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		author.getWrite().write();

	}
}
