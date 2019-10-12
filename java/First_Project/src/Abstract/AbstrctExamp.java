package Abstract;

public  abstract class AbstrctExamp {
	
	public AbstrctExamp() {                              //abstract class can have constructor
		System.out.println("const of AbstrctExamp");
	}
	
	 abstract void display();              //abstract method has no body
	 
	public void show() {                   //concrete method
		System.out.println("concrete method of abstract class");
	}

	public static void main(String[] args) {
		

	}

}
