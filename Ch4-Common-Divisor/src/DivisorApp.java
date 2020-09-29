import java.util.Scanner;

public class DivisorApp {

	public static void main(String[] args) {

	System.out.println("Welcome to the GCD App");	
	//while loop start
		//get input
	Scanner sc = new Scanner(System.in);
	String choice = "y";
			while(choice.equalsIgnoreCase("y")) {
					
	System.out.println();
	System.out.println("Enter First Number: ");
	int x =sc.nextInt();
	System.out.println();
	System.out.println("Enter Second Number: ");	
	int y =sc.nextInt();
	System.out.println();
		//biz logic
	
	while (x > 0) {
		while(y >= x) {
			y -= x;	//subtract x from y repeatedly

					
		}//swap x and y
		int tempY = y;
		y = x;
		x=tempY; //y = gcd
		
		
		
	}
	System.out.println("GCD:"+y);
		System.out.println();
		
		System.out.println("Continue?:");
		//display output
		//End while loop
	choice = sc.next();
	}
	System.out.println("Bye");	
	sc.close();
	}

}
