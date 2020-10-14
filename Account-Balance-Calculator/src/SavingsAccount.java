
public class SavingsAccount extends Account {
	
	private SavingsAccount monthlyIR;
	private SavingsAccount monthlyIntPay;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(SavingsAccount monthlyIR) {
		super();
		this.monthlyIR = monthlyIR;
	}
	

	public SavingsAccount getMonthlyIR() {
		return monthlyIR;
	}

	public void setMonthlyIR(SavingsAccount monthlyIR) {
		this.monthlyIR = monthlyIR;
	}

	public SavingsAccount getMonthlyIntPay() {
		return monthlyIntPay;
	}

	public void setMonthlyIntPay(SavingsAccount monthlyIntPay) {
		this.monthlyIntPay = monthlyIntPay;
	}
public void applyInterestPaymentToBalance() {
		monthlyIntPay = balance * monthlyIR;
		balance += monthlyIntPay;
}
}
