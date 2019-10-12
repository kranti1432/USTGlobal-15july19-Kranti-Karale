package com.dev.Collection;
import java.util.TreeSet;

import com.dev.Collection.Employee;

public class TreeSetEmployee {

	public static void main(String[] args) {
	TreeSet<Employee> ts=new TreeSet<Employee>();
	Employee e=new Employee();
	e.setEmail_id("krantikarale@gmail.com");
	e.setId(333);
	e.setName("kranti");
	e.setPassword("aaa123");

	Employee e1=new Employee();
	e1.setEmail_id("ashwini@gmail.com");
	e1.setId(111);
	e1.setName("ashwini");
	e1.setPassword("bbb123");
	
	Employee e2=new Employee();
	e2.setEmail_id("jaya@gmail.com");
	e2.setId(000);
	e2.setName("jaya");
	e2.setPassword("ccc123");

	Employee e3=new Employee();
	e3.setEmail_id("jaya@gmail.com");
	e3.setId(222);
	e3.setName("jaya");
	e3.setPassword("ccc123");
	
	ts.add(e);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	
	System.out.println(ts);

	}

}
