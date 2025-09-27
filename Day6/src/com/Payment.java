package com;

public class Payment {
	public void pay(int amt) {
		System.out.println("Generic Payment of "+amt);
	}
}
class CreditCard extends Payment {
	@Override
	public void pay(int amt) {
		System.out.println("Payment through Credit Card "+amt);
	}
	public void showCreditOffer() {
		System.out.println("Special credit card Offer Applied");
	}
}
class UPI extends Payment {
	@Override
	public void pay(int amt) {
		System.out.println("Payment through UPI "+amt);
	}
	public void showUPIOffer() {
		System.out.println("UPI cashback Offer Applied");
	}
}
