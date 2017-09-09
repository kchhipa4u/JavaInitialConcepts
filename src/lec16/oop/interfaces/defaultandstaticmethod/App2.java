package lec16.oop.interfaces.defaultandstaticmethod;
public class App2 implements D, B {
	@Override
	public void doIt() {
     System.out.println("inside App2...");		
	}
	
    public static void main(String[] args) {
        new App2().doIt();
    }
}

interface B {
    default void doIt() {
        System.out.println("inside B");
    }
}

interface D extends B {
    default void doIt() {
        System.out.println("inside D");
    }
}