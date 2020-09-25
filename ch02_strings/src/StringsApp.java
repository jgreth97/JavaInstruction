import java.util.Scanner;

public class StringsApp {

	public static void main(String[] args) {

	String firstname = "Bob";
	String lastname = "Marley";
	int age = 36;
	String message = "";

	message = firstname;
	message = message + " ";
	message += lastname;
	message += " was " + age + " years old when he passed";
	//"years \nold when he passed" = an escape character 
	System.out.println(message);
	
	//create a scanner instance and get data from user
	Scanner sc = new Scanner(System.in);
	//get a string 
	System.out.println("Enter a sentence: ");
	String sentence = sc.nextLine();
	//get an in
	System.out.println("Enter a int: ");
	 int n = sc.nextInt();
	 System.out.println("Enter a double: ");
	 Double d = sc.nextDouble();
	 
	 System.out.println(sentence);
	 System.out.println(n);
	 System.out.println(d);
	
	}
	

}
