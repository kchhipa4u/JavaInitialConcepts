package lec7.oop.constructors;

public class ConstructorDemo {

	int x;
	
	// Overloading
	
	private ConstructorDemo() {
		System.out.println("abc");
	}
	
	// default
	 ConstructorDemo(int x) {
		System.out.println("abc");
	}
	
	protected ConstructorDemo(int x, int y) {
		System.out.println("abc");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo();
		System.out.println(c.x);
		
		ConstructorDemo c1 = new ConstructorDemo(10);
	}

}
