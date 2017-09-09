package lec16.oop.abstractdemo;

public abstract class Account {

	public void depositAmount(int amount){
		System.out.println("Amount deposited to account: " +  amount);
	}
	
	public void withDrawAmount(int amount){
		System.out.println("Amount withdrawn from account: " +  amount);
	}
	
	/*public void calcInterest(){
		System.out.println("Interest Calculated");
	}*/
	
	abstract void calcInterest();
}
