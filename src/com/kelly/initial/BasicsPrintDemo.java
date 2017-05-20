package com.kelly.initial;

class BasicsPrintDemo {
 
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("\tHello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }
  
  public static void main(String[] args) {	
	   	// Language Basics 1
		print();				
  }       
}