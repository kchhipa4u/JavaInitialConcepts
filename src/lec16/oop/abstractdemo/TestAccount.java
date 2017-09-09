package lec16.oop.abstractdemo;

public class TestAccount {

	public static void main(String[] args) {
		// We can not create an instance of abstract class.
		//Account ac = new Account(); 
		
		Account saving = new SavingAccount();
		saving.depositAmount(1000);
		saving.withDrawAmount(500);
		saving.calcInterest();
		
		Account current = new CurrentAcount();
		current.calcInterest();
	}
}
