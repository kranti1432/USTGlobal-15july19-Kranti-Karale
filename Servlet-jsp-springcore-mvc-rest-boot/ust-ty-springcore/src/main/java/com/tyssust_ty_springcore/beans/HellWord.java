package com.tyssust_ty_springcore.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("hello")
public class HellWord implements InitializingBean,DisposableBean{
	private String msg;
	private int count;
	@Autowired
	@Qualifier("human")
	private Animal animal;
	private Map<String, Integer> map;
	public HellWord() {
		System.out.println("object created");
	}



	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("hello world destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialization of hello world");
	}

}
