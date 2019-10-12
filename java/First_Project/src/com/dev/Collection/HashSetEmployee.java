package com.dev.Collection;

import java.util.HashSet;

public class HashSetEmployee {

	public static void main(String[] args) {
HashSet<Employee> hs=new HashSet();

Employee e=new Employee();
e.setEmail_id("krantikarale@gmail.com");
e.setId(111);
e.setName("kranti");
e.setPassword("aaa123");

Employee e1=new Employee();
e1.setEmail_id("ashwini@gmail.com");
e1.setId(222);
e1.setName("ashwini");
e1.setPassword("bbb123");

Employee e2=new Employee();
e2.setEmail_id("jaya@gmail.com");
e2.setId(333);
e2.setName("jaya");
e2.setPassword("ccc123");

//update
e.setEmail_id("kkkkk@gmail.com");
e1.setEmail_id("aaaa@gmail.com");
e2.setEmail_id("jjjj@gmail.com");

boolean b=hs.add(e);
boolean b2=hs.add(e1);
boolean b3=hs.add(e2);
System.out.println("output for add() method: "+b+" "+b2+" "+b3);
System.out.println(hs);
System.out.println("size of hs before remove e :"+hs.size()); 

boolean b4=hs.remove(e);
System.out.println("output for remove() method: "+b4);
System.out.println(hs);
System.out.println("size of hs after remove e :"+hs.size());

hs.clear();
System.out.println("size of hs after clear :"+hs.size());


	}

}
