package Assesment;

public class FinalEmployee {

	public static void main(String[] args) {
		EmpImplements e=new EmpImplements();

		
		Employee e1=new Employee();
		e1.setEmail("krantikarale@gmail.com");
		e1.setId(123);
		e1.setMo(95278255);
		e1.setName("kranti");
		
		boolean b= e.putEmployee(e1);
		System.out.println(e);

		boolean b1=e.ContainsKeyEmployee(e1);
		System.out.println(b1);
		
		boolean b3=e.containsValueEmployee(e1);
		System.out.println(b3);
		
		boolean b4=e.removeEmployee(e1);
		System.out.println(b4);
		System.out.println(e);
		
	}

}
