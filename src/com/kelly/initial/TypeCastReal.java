package com.kelly.initial;

public class TypeCastReal {
	
	public static void main(String[] args) {
		// Implicit demo
		
		byte b1 = 125;
		byte b2 = 127;
		int b3 = b1 + b2;
		
		System.out.println(b3);
		
		// Explicit Typecasting
		
		//calculate percent
		
		TypeCastReal aa = new TypeCastReal();
		byte result = aa.calcPercent(1000, 800);
		
		System.out.println(result);
	}
	
	public byte calcPercent(int totalMarks, int marksObtain)
	{
		return (byte) (marksObtain*100/totalMarks);
		
	}

}
