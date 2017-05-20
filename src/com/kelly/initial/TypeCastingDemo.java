package com.kelly.initial;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// Inplicit Type Casting  small --> big
		int i = 3;
		double d; // 0.0
		
		d = i;           // OK, no explicit type casting required// d = 3.0
		System.out.println(d);
		
		
		// Explicit Typecasting
		// Big --> small
		double dd = 3.5;   // 234556677788888.2344
		int ii;
		 ii = (int) dd;   // 3
		//ii = (int) dd;
		 
		 // Max -> 127   -128, -127 ---- 0 ------- 127, -128== 128, -127==129,.....
		 byte b = 127;
		 
		 System.out.println(b);
		 
		 b = (byte) 128;
		   
		 
		System.out.println(b); 
	
	}
}
