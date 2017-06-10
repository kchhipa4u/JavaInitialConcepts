package lec9.oop.thisandsuper;

class AAA {
	AAA() {
		this(5);
		System.out.println("hello a");
	}

	AAA(int x) {
		System.out.println(x);
	}
}

class TestThis4 {
	public static void main(String args[]) {
		AAA a = new AAA();
	}
}