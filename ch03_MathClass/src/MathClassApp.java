
public class MathClassApp {

	public static void main(String[] args) {

		long result1 = Math.round(1.667);
		System.out.println(result1); //result = 2
		
		
		int result2 = Math.round(1.49F);
		System.out.println(result1); //result = 2

		int result3 = (int)Math.round(1.667); //casting from a long data type to an int
		System.out.println(result1); //result = 2

		//rounding to a 100th decimal value
		
		double x = 10.315;
		System.out.println(x);
		//casting x to a double
		x = (double)Math.round(x*100) / 100;
		System.out.println(x);
		
		x = (double)Math.round(x*10) / 10;
		System.out.println(x);
		
		System.out.println("generate some random numbers: ");
		double r = Math.random(); //generates numbers between 1 and 0
		System.out.println(r);
		r = Math.random()*10;
		System.out.println(r);
		
		//generate a roll of the die 1-6
		int die = (int)(Math.random()*6)+1;
		System.out.println("die roll is: " + die);
		
		
	}

}
