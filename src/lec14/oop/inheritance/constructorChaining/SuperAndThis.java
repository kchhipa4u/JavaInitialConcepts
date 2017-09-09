package lec14.oop.inheritance.constructorChaining;
class First
{
    final int x;
    First(int x) { this.x = x; }
}

class Problem1 extends First
{
    final int z;
    Problem1(int x, int y)
    {
    	super(x);
        this.z = this.x + y; // OOOPS! x hasn't been set yet
       // super(x);
    }        
}

class Problem2 extends First
{
    final int y;
    Problem2(int x, int y)
    {
    	 super(x); 
             x = 33;
        this.y = y; 
       // super(x); // OOOPS! x is supposed to be final
    }        
}

public class SuperAndThis
{
	Problem1 p1 = new Problem1(5, 10);
	
	Problem1 p2 = new Problem1(5, 10);
}