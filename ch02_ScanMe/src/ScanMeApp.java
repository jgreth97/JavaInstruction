import java.util.Scanner;

public class ScanMeApp {

	public static void main(String[] args) {
//Prompt user for 3 numbers on one line then get them
// pg.63
	System.out.println("Enter 3 ints seperated by a space: ");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	System.out.println("Sum or all #s: " + (n1+n2+n3));


	}

}
