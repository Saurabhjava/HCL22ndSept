package com;

public class Account {
	private Double balance=500.0;
	static Account acc;
	private Account() {
		
	}
	public void deposit(Double amt) {
		balance+=amt;
	}
	public Double getBalance() {
		return balance;
	}
	
	public static Account getInstance() {
		if(acc==null)
			acc=new Account();
		return acc;
	}
}
