package lec16.oop.abstractdemo;

public class CurrentAcount extends Account {

	@Override
	void calcInterest() {
		System.out.println("Interest rate is 5% for Current account.");
	}

}
