package Abstract;

public class ChildOfAbChild extends MainAbChild {
	static ChildOfAbChild c1=new ChildOfAbChild();
	
@Override
public void show2() {
	System.out.println("method from child of child of main abstract");
}
	public static void main(String[] args) {
c1.show2();
c1.show2();

	}

}
