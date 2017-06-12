package lec8.oop.scopeofvariables;

// local variables are by default final

// x = 5;
// re-assign or re-initialize value in any method.

// x =7;




public class LocalVariableScope {

	void foo(int p)
	{
		int x =10, z =x;
		int y=2;   // explicitly define the final variable
		if(x == 0)
		{
			 y = x;   // y = 0;
			 x = 0;
		}		
		y++;
		
		//System.out.println(y);
	}
	
	
	void add(int x, int y){
		 int z;  // Declaration of variable
		
		z = x+y;  // initialization of variable
		
		z =10;
		
			 for(int i=0; i < 10; i++)
			  {
				
			  }
		
		}
}
