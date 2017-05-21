package lec4.controlflow;

public class LoopDemo {

	// F6 -> to go to next line
	// F5 -> Step into
	// F7 -> Step Over
	// F8 -> To goto next break point
	public static void main(String[] args) {
		int sum=0; // output
		m1();
		m2();
		sum = addMe(sum);
		
		//syso // CTRL SPACE
		System.out.println(sum);
	}

	private static void m2() {
		   System.out.println("AAA");
		   System.out.println("AAA");
		   System.out.println("AAA");
		   System.out.println("AAA");
	}

	private static void m1() {
		System.out.println("AAA");
		   System.out.println("AAA");
		   System.out.println("AAA");
		   System.out.println("AAA");
	}

	private static int addMe(int sum) {  // CTRL + SHIFT + i
		for(int i=1; i <=10; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}
