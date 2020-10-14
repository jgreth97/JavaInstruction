import java.util.InputMismatchException;
import java.util.Scanner;

public class AnswerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			//*continue loop
			int theNumber = (int)(Math.random()*100) + 1;
			//System.out.println(theNumber);
			//start a game generate random number(theNumber)
			//display im thinking message
			System.out.println("I'm thinking of a number from 1 to 100"
		+"\nTry to guess it.");
			int count = 0;
			int guess = 0;
			while (guess != theNumber) {
			//initialize count
			
				//*win loop starts (guess == theNumber)
				guess = getIntWithRange("Enter Number: ", sc, 1,100);
				count++;
				//validate the user entry
				
				//biz logic- compare guess vs number
				int diff = theNumber - guess;
				//determine how far away
				
				//display appropriate message: win, tl, th, wtl, wth
				String message = "";
				if (diff > 10){
					message += "Way too low! Guess again.";
				}
				else if (diff < -10) {
					message += "Way too high! Guess again.";
				}
				else if (diff > 0) {
					message += "Too low! Guess again.";
				}
				else if (diff < 0) {
					message += "Too high! Guess again.";
				}
				else {
					message += "You got it in "+count+" tries!\n";
					if (count<=3)
						message += "Great work! Your a mathmatical wizard";
					else if (count<=7)
						message += "Not Bad. You've got some work to do";
					else if (count <= 10)
						message += "what took you so long";
				}
				System.out.println("\n"+message);
			}
				//display win message
				//*win loop ends
			//*continue loop ends
		
	
	
	
	choice = getRequiredString("Try again (y/n)", sc);
		}
		System.out.println("Bye");
sc.close();
		}
		private static int getInt(String prompt, Scanner sc) {
			int nbr = 0;
			while (true) {
				try {
					System.out.print(prompt);
					nbr = sc.nextInt();
					break;
				} catch (InputMismatchException ime) {
					System.out.println("Error!  Invalid integer.  Try again.\n");
					sc.nextLine();
					continue;
				}
			}
			return nbr;
			
			
			
		}
		private static int getIntWithRange(String prompt, Scanner sc, int min, int max) {
		int nbr = 0;
		boolean isValid = false;
		while(!isValid) { 
			nbr = getInt(prompt, sc);
			if (nbr < min) {
				System.out.println("Error! Number must be >="+min+".");
			}
			else if (nbr > max) {
				System.out.println("Error! Number must be >="+min+".");
			}
			else {
				isValid = true;
			}
		}
		return nbr;
	
		}
		private static String getChoiceString(String prompt, Scanner sc, String s1, String s2) {
			
			
			String str = "";
			boolean isValid = false;
			while(!isValid) {
				str = getRequiredString(prompt, sc);
				if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
					System.out.println("Invalid entry: Expected values are "+s1+" or "+s2+".");
				}
				else 
					isValid = true;
					}
			
			return str;
		}
		
		private static String getRequiredString(String prompt, Scanner sc) {
			String str = "";
			boolean isValid = false;
			while (!isValid) {
				System.out.println(prompt);
				str =sc.nextLine();
				if (str.equals("")) {
					System.out.println("Invalid Entery this field is required");
				}
				else {
					isValid = true;
				}
			}
					return str;
		

}
}
