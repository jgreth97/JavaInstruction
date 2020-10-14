
public class Account implements Withdrawable, Depositable, Balanceable {

	protected double balance;
	
	
public Account() {
		super();
	}

public Account(double balance) {
	super();
	this.balance = balance;
}


	//Generated when you make the class
//**************************************
	@Override
	public double getBalance() {
		return 0;
		balance  += amount;
	}
	@Override
	public void setBalance(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		return balance;
	}

	@Override
	public void withdrawl(double amount) {
		balance = amount;
//****************************************
	}

}
