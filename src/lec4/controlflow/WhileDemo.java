package lec4.controlflow;

import java.util.Scanner;

public class WhileDemo {
	
	public static void main(String[] args) {
		boolean isCoinTossed = false;
		
		System.out.println("Is coin tossed ");
		
		Scanner sc = new Scanner(System.in);
		isCoinTossed = sc.nextBoolean();
		
		while (!isCoinTossed) {
		  
			System.out.println("Toss begins in 15 mins");
			
			System.out.println("After 15 mins ");
			
			isCoinTossed = true;
			
			System.out.println("Game started now....");
			
		}
	}

}
