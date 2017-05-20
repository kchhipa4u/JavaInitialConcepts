package com.kelly.initial;

public class IntegerLiterals {

	public static void main(String[] args) {
		int number = -123;
		int sum = 1234567890;     // This value is within the range of int
		
		//max -> 2,147,483,627
		// default numeric value considered like int only
		long bigSum = 8234567890L;
		
		long smallSum = 12345;
		
		int number1 = 0b01010000101000101101000010100010;
		
		int number3 = 2_123_456;
		
		int nunmber4 = 2123456;
		
		// Max byte range :- 127
		
		byte smallNumber1 = 123;       // This is within the range of byte
		//byte smallNumber = 12345;     // ERROR: this value is outside the range of byte.
		short midSizeNumber = -12345;
		
		double avg = 55.66;
		//float average = 55.66;      // Error! RHS is a double. Need suffix 'f' for float.
		float average1 = 55.66F;
		
		
	}
}
