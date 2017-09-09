package lec16.oop.abstractdemo;

import java.util.ArrayList;
import java.util.List;

public class SavingAccount extends Account {

	@Override
	void calcInterest() {
      System.out.println("Interest rate is 8% for saving account.");		
	}
	
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
	}

}
