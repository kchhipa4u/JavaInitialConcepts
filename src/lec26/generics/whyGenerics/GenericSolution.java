package lec26.generics.whyGenerics;

public class GenericSolution {

	public static <T> void add(T a, T b) {
		System.out.println("sum is: " + a + b);
	}
	
	public static void main(String[] args) {
		add(4, 5);
		add(7.5, 9.7);
	}
}
