import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) {
		// ch2 pg 65-69
		
		//if & While statements 
		
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Traffic Light Color: ");
		String color = sc.nextLine();
		
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Red Light - stop!");
		}
		else if (color.equalsIgnoreCase("yellow")) {
			
			System.out.println("Yellow Light - slow down!");
		}
		else {
			
			System.out.println("Green Light - Go!");
		}
		System.out.println("Continue? (y/n)");
		choice = sc.nextLine();
		}
}
	
}
