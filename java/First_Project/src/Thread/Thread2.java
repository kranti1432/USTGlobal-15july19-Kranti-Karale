package Thread;

public class Thread2 extends Thread{

	@Override
	public void run() {
		System.out.println("thread 2 started");
		System.out.println("thread2 print the value of j");
		for(int j=1;j<10;j++) {
			System.out.println("j: "+j);
		}
		System.out.println("thread2 thread terminated");
	}
}
