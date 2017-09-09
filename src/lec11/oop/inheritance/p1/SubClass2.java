package lec11.oop.inheritance.p1;

import lec11.oop.inheritance.p2.InstanceAndStaticInheritance;

public class SubClass2 extends InstanceAndStaticInheritance{

	public void ins(){
		System.out.println(x);
	}
	
	public static void staticmethod(){
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		SubClass2 sc = new SubClass2();
		sc.ins();
		sc.staticmethod();
	}
}
