
public class CheckingAccount extends Account{

	private CheckingAccount monthlyFee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(CheckingAccount monthlyfee) {
		super();
		this.monthlyfee = monthlyfee;
	}
	
	public void subtractFeeFromBalance() {
	
	balance -= monthlyFee;
	}
	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee;
		
	}
	
}
