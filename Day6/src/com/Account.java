package com;

public class Account {
	private double balance=500;
	static Account acc;
	private Account() {
		
	}
	public void deposit(double amt) {
		balance+=amt;
	}
	public double getBalance() {
		return balance;
	}
	
	public static Account getInstance() {
		if(acc==null)
			acc=new Account();
		return acc;
	}
}
