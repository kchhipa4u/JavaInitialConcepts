package lec11.oop.inheritance.staticAndInheritance;

class Parent1{
	
	static int x = 5;
}

class Child1 extends Parent1{
	static int x = 10;
}
public class ExampleStaticVar {

	public static void main(String[] args) {
		System.out.println(Child1.x);
		
		Parent1 p1 = new Child1();
		System.out.println(p1.x);
		
	}
}
