package lec6.javabasic.memorymgmt.stackandheap;
/*
 * Static method :- main method
 * Static Block
 * 
 * instance Block
 * 
 * JDK 6 or 7 :- main method was not required to execute static block
 */


public class StaticBlockDemo {

	static{
		System.out.println("I am static block..");
	}
	
	// instance block
	{
		System.out.println("I am instance block..");
	}
	
	public StaticBlockDemo() {
		System.out.println("I am in constructor...");
	}



	public static void main(String[] args) {
		System.out.println("I am in main method...");
		
		// instance
		StaticBlockDemo s = new StaticBlockDemo();
	}
}
