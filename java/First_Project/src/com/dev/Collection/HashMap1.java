package com.dev.Collection;
import java.util.HashMap;

import com.dev.Encapsulation.Dog;
public class HashMap1 {

	public static void main(String[] args) {
HashMap<String,Dog> hm=new HashMap<String,Dog>();

Dog d=new Dog();
d.setAge(1);
d.setColor("black");
d.setBreed("D M");
d.setName("shiro");

Dog d1=new Dog();
d1.setAge(2);
d1.setBreed("Dalmation");
d1.setColor("white");
d1.setName("ronnie");

Dog d2=new Dog();
d2.setAge(3);
d2.setBreed("Dalmation");
d2.setColor("white&White");
d2.setName("ronnie");

hm.put("1", d);
Dog b=hm.put("1", d1);          //put method returns object
System.out.println(b);

hm.put("6",d1);
hm.put("2",d2);
System.out.println(hm);

Dog f=hm.remove("2");   //remove method returns object
System.out.println(f);
System.out.println(hm);

System.out.println("output of containsKey(): "+hm.containsKey("6"));
System.out.println("output of containsKey(): "+hm.containsKey("2"));

System.out.println("output of containsvalue(): "+hm.containsValue(d2));  //removed by key 2 thats why not present
System.out.println("output of containsvalue(): "+hm.containsValue(d1));  


	}

}
