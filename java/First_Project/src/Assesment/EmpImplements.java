package Assesment;

import java.util.HashMap;

public class EmpImplements implements EmInterface{


@Override
	public String toString() {
		return "EmpImplements [hm=" + hm + "]";
	}

HashMap< String, Employee> hm=new HashMap< String, Employee>();

	

	@Override
	public boolean putEmployee(Employee e) {
hm.put("1",e);
System.out.println(hm);
		return true;
	}

	@Override
	public boolean removeEmployee(Employee e) {
		hm.put("1", e);
		return true;
	}

	@Override
	public boolean containsValueEmployee(Employee e) {
		hm.containsValue(e);
		return true;
	}

	@Override
	public boolean ContainsKeyEmployee(Employee e) {
		hm.containsKey("1");
		return true;
	}

}
