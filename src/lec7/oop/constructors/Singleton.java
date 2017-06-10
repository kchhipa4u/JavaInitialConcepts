package lec7.oop.constructors;

public class Singleton {

	private Singleton() {
		System.out.println("private constructor.");
	}

	public static void main(String[] args) {
		Singleton s1 = new Singleton();
		
	}
}
