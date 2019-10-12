package Assesment;

public class MainPractice {

	public static void main(String[] args) {
		PracticeImplement p=new PracticeImplement();
		PracticePrivate p1=new PracticePrivate();
		p1.setEmail("krantikarale@gmail.com");
		p1.setId(111);
		p1.setMo(95278255);
		p1.setName("kkkk");
		
		PracticePrivate p2=new PracticePrivate();
		p2.setEmail("kranti@gmail.com");
		p2.setId(333);
		p2.setMo(95278255);
		p2.setName("lifawlfawk");
		
		
		
		System.out.println(p.addPractice(p1));
		System.out.println(p);
		
		System.out.println(p.removePractice(p1));
		
		System.out.println(p.containskeyPractice("1"));
		
		System.out.println(p.containsvaluePractice(p1));
		
		System.out.println(p.addPractice(p2));
		System.out.println(p);
		
		System.out.println(p.removePractice(p2));
		
		System.out.println(p.containskeyPractice("1"));
		
		System.out.println(p.containsvaluePractice(p2));
		

	}

}
