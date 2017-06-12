package lec10.oop.boxedprimitive;

public class CompareBoxedPrimitives {

	static void compare() { 
		System.out.println("Compare simple primities first");
		int x =5;
		int y =5;
		
		System.out.println("(x == y): " + (x == y));
		  System.out.println("\nInside compareBoxPrimitives ...");
	      Integer num1 = new Integer(0);
		  Integer num2 = new Integer(0);
		  System.out.println("(num1 == num2): " + (num1 == num2));
		  
		  // Solutions:
		  System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
		  System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));
		  	  
		  Integer num3 = new Integer(1);
		  System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
	    }
	
	static Integer i;
	
	/**
	 * Mixed Type Computation - Un-Boxing will perform
	 * It will give NullPointerException
	 */
	static void unbelievable() {
	  System.out.println("\nInside unbelievable ...");
      if (i == 0)
         System.out.println("weird!");
    }
	
	public static void main(String[] args) {
		compare();
	}
}
