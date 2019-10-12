package Assesment1;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeImpiment e=new EmployeeImpiment ();


		Employee e1=new Employee();
		e1.setEmail("krantikarale@gmail.com");
		e1.setEmpid(1);
		e1.setEname("kranti");
		e1.setPassword("kkkk");
		e1.setSalary(1100000);

		Employee e2=new Employee();
		e2.setEmail("krantikarale@gmail.com");
		e2.setEmpid(2);
		e2.setEname("kranti");
		e2.setPassword("kkkk");
		e2.setSalary(900000);

		Employee e3=new Employee();
		e3.setEmail("krantikarale@gmail.com");
		e3.setEmpid(3);
		e3.setEname("kranti");
		e3.setPassword("kkkk");
		e3.setSalary(600000);

		Employee e4=new Employee();
		e4.setEmail("krantikarale@gmail.com");
		e4.setEmpid(4);
		e4.setEname("kranti");
		e4.setPassword("kkkk");
		e4.setSalary(200000);



		boolean b=e.addEmployee("1", e1);
		System.out.println("employee added? "+b);
		System.out.println(e);

		boolean b1=e.addEmployee("2", e2);
		System.out.println("employee added? "+b1);
		System.out.println(e);

		boolean b2=e.addEmployee("3", e3);
		System.out.println("employee added? "+b2);
		System.out.println(e);

		boolean b3=e.addEmployee("4", e4);
		System.out.println("employee added? "+b3);
		System.out.println(e);

		System.out.println(e.searchKeyEmployee("1"));
		System.out.println(e);

		System.out.println(e.searchValueEmployee(e4));
		System.out.println(e);

		if( e1.getSalary()>1000000) {
			e1.setGrade("AA");
			System.out.println(e);

		}	else if(e1.getSalary()>=860000&&e1.getSalary()<=1000000) {
			e1.setGrade("A");
			System.out.println(e);

		}
		else if(e1.getSalary()>=540000&&e1.getSalary()>=540000) {
			e1.setGrade("B");
			System.out.println(e);

		}
		else{
			e1.setGrade("C");
			System.out.println(e);

		}


	}

}
