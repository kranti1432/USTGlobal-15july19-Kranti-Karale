package Assesment1;

import java.util.HashMap;

public class EmployeeImpiment implements EmployeeInterface {
	//HashMap<String s,Employee e> hm=new HashMap<String s,Employee e>();
	HashMap<String ,Employee > hm=new 	HashMap<String ,Employee> ();
	@Override
	public boolean addEmployee(String s, Employee e) {
		if(hm.put(s, e) != null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeEmployee(Employee e) {
		hm.remove("1");
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeImpiment [hm=" + hm + "]";
	}

	@Override
	public boolean searchKeyEmployee(String s) {
		if(hm.containsKey(s)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean searchValueEmployee(Employee e) {
		if(hm.containsValue(e)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean grade(String s, Employee e) {
		hm.put(s, e);
		return true;
	}





}
