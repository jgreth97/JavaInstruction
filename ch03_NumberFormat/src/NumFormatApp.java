import java.text.NumberFormat;

public class NumFormatApp {

	public static void main(String[] args) {

		double astonMartinPrice =245789.23;
		double interestPct = .035557;
		 
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();		
		pct.setMaximumFractionDigits(2);
		
	System.out.println("Car finance info:");
		System.out.println("Price:\t\t"+currency.format(+astonMartinPrice));
		System.out.println("Interst:\t"+pct.format(interestPct));
		
	
	}

}
