import java.util.Scanner;

public class MoreForLoopsApp {

	public static void main(String[] args) {
 //write a loop that will run 100 times
//print the iteration number
		
		for(int i=1; i <= 100; i++) {
			System.out.println("In the loop... i="+i);
		}
		// same loop 0-100 count by 2's
		for (int i =0; i<=100; i+=2) {
			System.out.println("In the loop... i="+i);

		}
		// get user input for max #
		
		Scanner sc = new Scanner(System.in);
			System.out.println("How high should I count?");
			int max = sc.nextInt();
			for (int i = 0; i <= max; i++) {
				System.out.println("i="+i);
			}
		
		
		
	}

}
