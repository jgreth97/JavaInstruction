import java.util.Scanner;
		public class GradeApp {

			public static void main(String[] args) {
//Welcome Message
				System.out.println("Welcome to the Letter Grade Converter");
				System.out.println();
//User input
				Scanner sc = new Scanner(System.in);
			
				String choice = "y";
				while(choice.equalsIgnoreCase("y")) {
// picked "Y" to initialize the while loop as troop
				System.out.print("Enter nummerical grade: ");
				int grade = sc.nextInt();
				String lettergrade = "";
				
//Biz Logic - if else convert numeric grade to letter grade 
				
				if (grade >= 88) {
					lettergrade = "A";
				}
				else if (grade >= 80) {
					lettergrade = "B";
				}
				else if (grade >= 68) {
					lettergrade = "C";
				}
				else if (grade >= 60) {
					lettergrade = "D";
				}
				else { lettergrade = "F"; }
				
// display output
				System.out.println("Letter Grade: "+lettergrade+"\n");
//while loop ends
// Goodbye 
					
				System.out.print("Continue (y/n)" );
				choice = sc.next();
				}
				System.out.println("Goodbye");
				sc.close();
			}
		}
			
