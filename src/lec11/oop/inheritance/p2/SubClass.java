package lec11.oop.inheritance.p2;

public class SubClass extends InstanceAndStaticInheritance {

	public void ins(){
		System.out.println(x);
	}
	
	public static void staticmethod(){
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.ins();
		sc.staticmethod();
	}
}
