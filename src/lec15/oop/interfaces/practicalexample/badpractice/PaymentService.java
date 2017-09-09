package lec15.oop.interfaces.practicalexample.badpractice;

public class PaymentService {

	public void paymentByCreditCard()
	{
		System.out.println("Payment done by Credit Card");
		// would call DAO
	}
	
	public void paymentByPayPal(){
		System.out.println("Payment done by PayPal");
	}
	
	public void paymentByDebitCard(){
		System.out.println("Payment done by Debit Card");
	}
}
