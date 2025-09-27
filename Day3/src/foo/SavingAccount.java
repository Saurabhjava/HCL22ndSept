package foo;

public class SavingAccount extends Account {
	private String accType;
	public SavingAccount(Long accNo, double balance, Person accHolder, String accType) {
		super(accNo, balance, accHolder);
		this.accType=accType;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
}
