package Thread;

public class Thread1 {

	public static void main(String[] args) {
		System.out.println("main thread started............");
		
//		Thread2 t2=new Thread2();
//		t2.start();
		
		new Thread2().start();
		
		new Thread(new Thread3()).start();
	}

}
