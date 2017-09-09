package lec26.generics.whyGenerics;

public class ProblemWithoutGeneric {

	public static void add(int a, int b) {
		System.out.println("sum is: " + a + b);
	}

	public static void add(double a, double b) {
		System.out.println("sum is: " + a + b);
	}

	public static void main(String[] args) {
		add(4, 5);
		add(7.5, 9.7);
	}
}
