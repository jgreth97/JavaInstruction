import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class IntrestCalcApp {

	public static void main(String[] args) {

		
		System.out.println("Welcome to the Intrest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		
		
		while (choice.equalsIgnoreCase("y"));{
			System.out.print("Enter loan amount: ");
			double loanAmt = sc.BigDecimal();
			BigDecimal loanAmtBD =  sc.nextBigDecimal(loanAmt);
			System.out.print("Enter Interest Rate: ");
			double intRate = sc.BigDeciaml(intRate);
			BigDecimal intRateBD = sc.nextBigDecimal(intRate);
			
			BigDecimal intAmt = loanAmt.multiply(intRateBD).setscale(2, RoundingMode.HALF_UP);
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			
			System.out.println();
			System.out.println("Loan Amount:\t "+currency.format(loanAmtBD));
			System.out.println("Loan Amount:\t "+percent.format(intRateBD));
			System.out.println("Loan Amount:\t "+currency.format(intAmt));
			System.out.println();

		System.out.print("Continue? (y/n)");
		choice = sc.next();
		}
System.out.println("Bye");
sc.close();
		
	}

}
