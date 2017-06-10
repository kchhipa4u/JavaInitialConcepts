package lec8.oop.staticconcepts;

public class OneMoreStaticBlock {

	int x =5;
	
	static int y=10;
	
	static{
		//x;
		//y;
		OneMoreStaticBlock a1 = new OneMoreStaticBlock();
		System.out.println(a1.x);
	}
	
	public static void main(String[] args) {
		
	}
}
