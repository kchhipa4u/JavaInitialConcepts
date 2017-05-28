package lec4.controlflow;

public class BreakExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			  //continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Outside of the loop...");
	}
}
