package foo;

public class Account {
	private Long accNo;
	private double balance;
	private Person accHolder;
	
	public Account(Long accNo, double balance, Person accHolder) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amt) {
		balance+=amt;
	}
	
}
