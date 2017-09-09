package lec15.oop.interfaces.practicalexample.badpractice;

public class PaymentClient {
	
	public static void main(String[] args) {
		PaymentController pc = new PaymentController();
		
		pc.paymentForCreditCard();
		
		pc.paymentForPayPal();
		
		pc.paymentForDebitCard();
	}
}
