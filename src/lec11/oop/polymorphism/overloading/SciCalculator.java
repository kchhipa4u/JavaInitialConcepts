package lec11.oop.polymorphism.overloading;

public class SciCalculator extends Calculator {

	public int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public int sum(int m, int n)
	{
		return m+n;
	}
	
	public double sum(double x, double y)
	{
		return x+y;
	}
	
}
