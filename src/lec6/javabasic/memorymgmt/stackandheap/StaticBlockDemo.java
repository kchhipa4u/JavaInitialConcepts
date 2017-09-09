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
   // Static block will be called one and only one time.
	static{
		System.out.println("I am static block..");
	}
	
	// It will execute every time whenever object is created and it calls before constructor.
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
		StaticBlockDemo s1 = new StaticBlockDemo();
	}
	
	static{
		System.out.println("Second static block..");
	}
}
