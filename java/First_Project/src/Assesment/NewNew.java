package Assesment;

public class NewNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewImple n=new NewImple();
		
		New n1=new New();
		n1.setId(1);
		n1.setName("kk");
		
		System.out.println(n.addNew("1",n1));
		System.out.println(n);
		
		System.out.println(n.containsKeyNew("1"));
		System.out.println(n.containsValueNew(n1));
		
		
		New n2=new New();
		n2.setId(2);
		n2.setName("kk");
		
		New n3=new New();
		
		System.out.println(n.addNew("2",n2));
		System.out.println(n);
		
		System.out.println(n.containsKeyNew("3"));
		System.out.println(n.containsValueNew(n3));
		

	}

}
