import java.util.Scanner;

public class PowersApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Square and Cubes table");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer: ");
			System.out.println();
			int number = sc.nextInt();
			System.out.println("Number"+" "+"Squared"+" "+"Cubed");
			System.out.println("======"+" "+"======="+" "+"=====");
		
			
			
			for (int i = 1; i < number; i++)
				
		{
			int square = i * number;
			int cube = square * number; 
			
			System.out.println(i+square+ cube);
			System.out.println();
			
			
			
			
			
			
			
			
			
			System.out.print("Continue? (y/n)" );
				choice = sc.next();	
			
		}
		
		
		
	}
sc.close();
}
}
