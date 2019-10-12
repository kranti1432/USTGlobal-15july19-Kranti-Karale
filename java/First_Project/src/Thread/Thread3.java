package Thread;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread 3 started");
		System.out.println("thread3 print value of i");
		for(int i=1;i<5;i++) {
			System.out.println("i: "+i);
		}
		System.out.println("thread3 terminated");
	}

}
