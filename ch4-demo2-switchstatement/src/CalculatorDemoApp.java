import java.util.Scanner;

public class CalculatorDemoApp {

	public static void main(String[] args) {
System.out.println("Welcome to the Calculator demo App");

Scanner sc = new Scanner(System.in);

String command ="";
while (!command.equalsIgnoreCase("x")) {
	System.out.println();
	System.out.println("Command Menu:");
	System.out.println("============");
	System.out.println("1: Addition");
	System.out.println("2: Subtraction");
	System.out.println("x: Exit App");
	System.out.println();
	System.out.println("Enter Command: ");
	command = sc.next();
	int n1 = 0;
	int n2 = 0;
	int result = 0;
	switch (command) {
	case "1": 
		System.out.println("Addition:");
		System.out.println("Enter 2 numbers on one line");
			n1=sc.nextInt();
			n2=sc.nextInt();
			result = n1 + n2;
		System.out.println("Result: "+result);
		System.out.println();
		break; 
	case "2":
		System.out.println("Subtraction:");
		System.out.println("Enter 2 numbers on one line");
			n1=sc.nextInt();
			n2=sc.nextInt();
			result = n1 - n2; 
		System.out.println("Result: "+result);
		System.out.println();
		break;
	case "x":
	case "X":
		break;
	default:
		System.out.println("Invalid Entry!");
		System.out.println();
		break;
		
		
	}
}


sc.close();
System.out.println("Bye");
	}

}
