package ui;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HI");
		int number = 0;
				while (number!=99) {
					System.out.println("Enter a number ");
					try {
						number = sc.nextInt();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						sc.nextLine();
					}
					System.out.println("You entered:"+number);
					System.out.println();
					
					
				}
		
		
		sc.close();
		System.out.println("Bye");
	}

}
