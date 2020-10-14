import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Roll the Dice? (y/n)");
				choice = sc.next();
				
				int d1 = diceroll();
				int d2 = diceroll();
				int total = (d1 + d2);
				System.out.println("Die 1: "+d1);
				System.out.println("Die 2: "+d2);
				System.out.println("Total: "+total);
				
			if (total == 2) {
				System.out.println("Snake Eyes!");
				
			}
			else if (total == 12) {
				System.out.println("Boxcars!");
			}
			else {
				continue;
			}
				
			}
	
		sc.close();
	}
	public static int diceroll() {
	int d1 = (int) (Math.random()*6)+1;
	
		return d1;
	}
}
