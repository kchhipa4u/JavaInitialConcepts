package lec8.oop.staticconcepts;

public class StaticBasicsDemo {

	{
		System.out.println("Instance initializer block..");
	}

	public StaticBasicsDemo() {
		System.out.println("Inside no-arg constructor..");
	}
	
	public StaticBasicsDemo(int x) {
		System.out.println("Inside parameterized constructor.. " + x);
	}
	
	public static void main(String[] args) {
		StaticBasicsDemo sd = new StaticBasicsDemo();
		StaticBasicsDemo ds1 = new StaticBasicsDemo(10);
	}
	
	
}
