package Assesment;

import java.util.HashMap;

public class NewImple implements NewInter {
	@Override
	public String toString() {
		return "NewImple [hm=" + hm + "]";
	}

	HashMap<String,New> hm=new HashMap<String,New>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addNew(String s,New n) {
	hm.put(s, n);      
		return true; 
	}

	@Override
	public boolean removewNew(New n) {
hm.remove(n);
		return true;
	}

	@Override
	public boolean containsValueNew(New n) {
if(hm.containsValue(n)) {
		return true;
	}
return false;
	}

	@Override
	public boolean containsKeyNew(String s) {
		if(hm.containsKey(s)) {
			return true;
		}

		return false;
	}

}
