import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("I'm thinking of a number from 1 to 100");
		System.out.println("Try to guess it.");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
			while (choice.equalsIgnoreCase("y")){
				System.out.println("Enter a number: ");
					int guess = sc.nextInt();
				int randnum = randomNum();
				if (guess != randnum) {
				System.out.println("Try again (y/n)");
				choice = sc.next();
				}
				else if (guess > randnum) {
					System.out.println("Too high");
					
				}
				else if (guess < randnum) {
					System.out.println("Too Low");
					
				}
				else if (guess + 10 > randnum) {
					System.out.println("Way too high");
				}
				else if (guess - 10 < randnum) {
					System.out.println("way to Low");
				}
				else if
					(guess == randnum){
					System.out.println("Great work! You are a mathematical wizard");
				}
	 
		sc.close();
			}
	}
	public static void NumberOTries(int n) {
		for (int i = 1; i <= n; i++){
			 System.out.println("You git it in"+ i +"number of tries");}
		}
	public static int randomNum(){
		int g1 = (int) (Math.random()*100)+1;
		
		return g1; 
	}
	{
	
		
		
		
		
		
		
}
}
