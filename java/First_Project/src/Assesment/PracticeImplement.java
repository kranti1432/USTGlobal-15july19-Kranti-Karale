package Assesment;

import java.util.HashMap;

public class PracticeImplement implements PracticeInterface {
@Override
	public String toString() {
		return "PracticeImplement [hm=" + hm + "]";
	}

HashMap<String,PracticePrivate> hm=new HashMap<String,PracticePrivate>();
	@Override
	public boolean addPractice(PracticePrivate p) {
		hm.put("1", p);
		//hm.put("2", p);
		return true;
	}

	@Override
	public boolean removePractice(PracticePrivate p) {
	hm.remove(p);
		return true;
	}

	@Override
	public boolean containskeyPractice(String key) {
		hm.containsKey("1");
		return true;
	}

	@Override
	public boolean containsvaluePractice(PracticePrivate p) {
		hm.containsValue(p);
		return true;
	}

}
