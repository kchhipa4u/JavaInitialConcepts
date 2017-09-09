package lec11.oop.polymorphism.overloading;

/**
 * @author kanhaiya.chhipa
 *  Valid Overloading Cases
 *  1.number of different parameter could be changed
 *  2. No. of arguments are same but are of different data types
 *  3. Overloading is possible in same class and Child class also
 */
public class Calculator {
	
	public int sum(int x, int y)
	{
		return x+y;
	}
	
	// not a valid overloading case...
	private int add(int x, int y)
	{
		return x+y;
	}
	
	public double sum(double x, double y)
	{
		return x+y;
	}
	
	public void test(){
		
	}

}
