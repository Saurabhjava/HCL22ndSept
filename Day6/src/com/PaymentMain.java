package com;

public class PaymentMain {
	public static void main(String[] args) {
		Payment obj=new Payment();
		obj.pay(1000);
		//obj=new CreditCard();
		obj.pay(1000);
		((CreditCard)obj).showCreditOffer();
		obj=new UPI();
		obj.pay(1000);
		((UPI)obj).showUPIOffer();
	}
}
