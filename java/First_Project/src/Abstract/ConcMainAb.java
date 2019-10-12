package Abstract;

public class ConcMainAb extends MainAbstr{
	static ConcMainAb c=new ConcMainAb();
	
	@Override
	public void show1() {
		System.out.println("abstracted method from main abstract");
	}

	public static void main(String[] args) {
		c.show1();

	}

}
