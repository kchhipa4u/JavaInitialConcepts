package lec11.oop.inheritance.staticAndInheritance;

class Super {
	
	// static method
	static String greeting() {
		return "Goodnight";
	}

	// Instance meyhod
	String name() {
		return "Madhu";
	}
}

class Sub extends Super {
	// method hiding
	static String greeting() {
		return "Hello";
	}

	String name() {
		return "Anil";
	}
}

public class Test {
	public static void main(String[] args) {
		
		Super s = new Sub();
		
		System.out.println(s.greeting() + ", " + s.name());
		
		Sub ss = new Sub();
		System.out.println(ss.greeting() + ", " + ss.name());
	}
}