package lec9.oop.thisandsuper;

class AA {
	
	AA() {
		System.out.println("hello a");
	}

	AA(int x) {
		this();  // This must be the first line in the constructor
		AA();
		System.out.println(x);
	}

	private void AA() {
      System.out.println("This is method");		
	}
}

public class TestThis3 {
	public static void main(String args[]) {
		AA a = new AA(10);
	}
}
