package lec11.oop.polymorphism.overloading;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int res1 = calc.sum(10, 20);
		System.out.println(res1);
		
		calc.sum(40, 50);
		
		//int res2 = calc.sum(10, 20, 30);
		//System.out.println(res2);
	}

}
