
public class CalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator App!!");
		// This simple app will add two numbers
		int n1 = 5;
		int n2 = 25;
		int sum = n1 + n2;
				System.out.println("The sum is " + sum);
		
		
		// Do more math
		double d1 = 25.5;
		double d2 = 5.0;
		
		System.out.println("The difference is " + (d1 - d2));
		System.out.println("The product is " + (d1 * d2));
		System.out.println("The quotiant is " + (d2 / d1));
		//Doesn't work
		//int sum = n1 + d1;
		//Doesn't work
		//change sum to double
		double sum2 = n1 + d2;
		//or cast to an int 
		//doesnt work
		//int sum = n1 + d1;
		//casting d1 as an int
		sum = n1 + (int) d1;
// ^wont print out, extra math involved, just showing how to do the math^
// declaring a count variable
		int i = 0;
		i = i + 1;
		System.out.println(i);
		System.out.println("Goodbey");
	}

}
