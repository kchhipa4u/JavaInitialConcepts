package lec16.oop.abstractdemo;

public class A implements I1 {

	@Override
	public void m1() {
      System.out.println("Implemented I1 : m1()");		
	}
	
	public static void main(String[] args) {
		new A().m1();
	}

	@Override
	public void m2() {
		System.out.println("Implemented I1 : m2()");
		
	}

}
