package lec11.oop.inheritance.p1;

public class NewChild extends Parent{

	// NewChild HAS-A Parent
	public static void main(String[] args) {
		Parent p = new Parent();   /// Composite relationship not inheritance
		//p.
		
		NewChild nc = new NewChild();  // Inheritance
		//nc.
	}
}
