package lec16.oop.interfaces.defaultandstaticmethodClient;

import lec16.oop.interfaces.defaultandstaticmethod.Calculator;
import lec16.oop.interfaces.defaultandstaticmethod.CalculatorFactory;

public class BasicCalculatorClient {

	public static void main(String[] args) {
		//BasicCalculator cal = new BasicCalculator();
		//Calculator calculator = new BasicCalculator();
		//int sum = calculator.add(1, 2);
		
		Calculator instance = CalculatorFactory.getInstance();
		System.out.println(instance.add(1, 2));
	}
}
