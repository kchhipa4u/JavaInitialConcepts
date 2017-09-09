package lec17.exceptions.fundamentals;

public class MethodAccess {

	public void m1(){
		System.out.println("My Method");
		m1();
	}
	
	public static void main(String[] args) {
		MethodAccess abc = new MethodAccess();
		abc.m1();
	}
	
}
