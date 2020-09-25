import java.util.Scanner;

public class Student_RegistrationApp {

	public static void main(String[] args) {

		System.out.println("Student Registration Form");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Firstname: ");
		String firstname = sc.nextLine();
		
		System.out.println("Enter Lastname: ");
		String lastname = sc.nextLine();
		
		System.out.println("Enter year of Birth: ");
		int birthyear = sc.nextInt();
		
		System.out.println("Welcome " + firstname +" "+ lastname +"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+ lastname+"*"+birthyear);
		
		
		
		
		
		
	
		
		
		
	
		
		
		
		
		
		
		
	}

}
