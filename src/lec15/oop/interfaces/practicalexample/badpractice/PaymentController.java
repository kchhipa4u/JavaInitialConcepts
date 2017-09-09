package lec15.oop.interfaces.practicalexample.badpractice;

public class PaymentController {

	PaymentService payService = new PaymentService();
	
	public void paymentForPayPal(){
		
		payService.paymentByPayPal();
	}
	
	public void paymentForCreditCard(){
		payService.paymentByCreditCard();
	}
	
	public void paymentForDebitCard(){
		payService.paymentByDebitCard();
	}
	
}
