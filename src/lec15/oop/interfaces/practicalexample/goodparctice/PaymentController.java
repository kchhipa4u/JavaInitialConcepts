package lec15.oop.interfaces.practicalexample.goodparctice;

// Spring Framework, DI

public class PaymentController {

	private PaymentService paymentService;
	
	public void initiatePayment(AccountInfo accountInfo)
	{
		paymentService.makePayment(accountInfo);
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	
	
	
	/*public static void main(String[] args) {

		// Saying to framework that create an object first.
		paymentService = new PaymentServiceCreditCardImpl();
		PaymentController pc1 = new PaymentController();
		pc1.initiatePayment(new AccountInfo());
		
		
		//paymentService.makePayment(new AccountInfo());
		
		paymentService = new PaymentServicePayPalImpl();
		paymentService.makePayment(new AccountInfo());
		
	}
	
	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}*/
	
}
