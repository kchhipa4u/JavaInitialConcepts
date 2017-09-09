package lec15.oop.interfaces.practicalexample.goodparctice;

public class PaymentServicePayPalImpl implements PaymentService{

	@Override
	public void makePayment(AccountInfo accountInfo) {
		System.out.println("Payment done by pay pal");
	}

}
