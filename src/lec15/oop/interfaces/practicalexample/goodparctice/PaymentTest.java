package lec15.oop.interfaces.practicalexample.goodparctice;

public class PaymentTest {
	
	//static PaymentService ps = new PaymentServiceCreditCardImpl();

	public static void main(String[] args) {
		PaymentController pc = new PaymentController();
		
		// Spring - Start
		PaymentService paymentService = new PaymentServiceCreditCardImpl();
		pc.setPaymentService(paymentService);
		// Spring - End
		
		pc.initiatePayment(new AccountInfo());
	}
}
