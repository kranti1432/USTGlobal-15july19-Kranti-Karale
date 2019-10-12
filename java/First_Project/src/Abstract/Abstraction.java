package Abstract;

public class Abstraction extends AbstrctExamp {
	
	public Abstraction() {
		System.out.println("constru of Abstraction class");
	}
	
	
	@Override
	 void display() {
		System.out.println("this is a implemented  abstract method ");
	}

	public static void main(String[] args) {
		
		Abstraction a=new Abstraction();
		a.display();
		a.show();
	}

}
