package com;

public class AccountMain {
	public static void main(String[] args) {
		Account ebanking=Account.getInstance();
		System.out.println(ebanking.getBalance());
		ebanking.deposit(1000.0);
		System.out.println(ebanking.getBalance());
		
		Account upi=Account.getInstance();		
		System.out.println(upi.getBalance());
		System.out.println(ebanking==upi);
		upi.deposit(500.0);
		System.out.println(ebanking.getBalance());
	}
}
