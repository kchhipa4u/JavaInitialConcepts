package lec10.oop.boxedprimitive;

public class ExpensiveBoxedOperation {

	
	static void veryExpensive() { 
		  System.out.println("\nInside veryExpensive ...");
	      Long sum = 0L;
		  for (long i = 0; i < Integer.MAX_VALUE; i++) {
		      sum = sum + i;
		  }
	    }
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		  veryExpensive();
		  System.out.println("Elapsed time: " + ((System.nanoTime() - start) / 1000000.0) + " msec");
	}
}
