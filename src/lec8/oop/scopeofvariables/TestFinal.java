package lec8.oop.scopeofvariables;

public class TestFinal {

	static final int x;
	
	static{
		x =25;
	}
}

class Test
{
	final int x;
	
	public Test(){
		x = 10;
	}
}
