package lec11.oop.polymorphism.overloading;

/**
 * @author kanhaiya.chhipa
 *
 * Valid Overloading case
 */
public class MainOverloading {

	public static void main(String[] args) {
		System.out.println("inside main");
		
		main(10);
	}
	
	public static void main(int x) {
		System.out.println("inside main" + x);
	}
}
