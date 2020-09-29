import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalApp {

	public static void main(String[] args) {
//pg.111
		
		double pct = .03456789;
		System.out.println(pct);
		
		//create big decimal with scale of 4 and half up rounding
		// scale = number of decimal spaces 
		BigDecimal pctBD = new BigDecimal(pct);
		System.out.println(pctBD);
	
		pctBD = pctBD.setScale(4, RoundingMode.HALF_UP);
		System.out.println(pctBD);
		
		//add and subtract 
		//creating two instances of big decimal 
		BigDecimal bd1 = new BigDecimal(50); //int 
		BigDecimal bd2 = new BigDecimal(25.5); //double
		BigDecimal bd3 = new BigDecimal("10.75");//string
		
		BigDecimal sum = bd1.add(bd2);
		System.out.println(sum);
		
		BigDecimal diff = bd2.subtract(bd3);
		System.out.println(diff);
		
		BigDecimal product = bd2.multiply(bd3);
		System.out.println(product);
		
		BigDecimal quotient = bd1.divide(bd3,7,RoundingMode.HALF_UP);
		System.out.println(quotient);
		
		
		
		
		
		
	}

}
