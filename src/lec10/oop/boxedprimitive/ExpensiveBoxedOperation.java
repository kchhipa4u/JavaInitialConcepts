package lec10.oop.boxedprimitive;


/**
 * @author kanhaiya.chhipa
 * 
 * performance issue because of using Long Wrapper class in the program.
 * 
 * Run the program. Observe the time.
 * Re-Run the program using primitive 'long' and observe the time again
 *
 */
public class ExpensiveBoxedOperation {

	
	static void veryExpensive() { 
		  System.out.println("\nInside veryExpensive ...");
	      Long sum = 0L; 
		  for (long i = 0; i < Integer.MAX_VALUE; i++) {
		      sum = sum + i;  // auto-unboxes sum, addition, auto-boxes again
		  }
	    }
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		  veryExpensive();
		  System.out.println("Elapsed time: " + ((System.nanoTime() - start) / 1000000.0) + " msec");
	}
}
