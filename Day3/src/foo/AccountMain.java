package foo;

import java.util.Random;

public class AccountMain {

	public static void main(String[] args) {
		Random r=new Random();
		Account acc=new SavingAccount(r.nextLong(), 500, new Person("Kushal",21),"Saving");
		
		System.out.println("Account No:"+acc.getAccNo());
		System.out.println("Balance:"+acc.getBalance());
		System.out.println("Your Account is:"+((SavingAccount)acc).getAccType());
		acc.deposit(5000);
		System.out.println("Balance:"+acc.getBalance());
		
	}

}
