import java.util.Scanner;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		System.out.println();
		Scanner sc = new Scanner(System.in); 
	String command ="";
		while(!command.equalsIgnoreCase("3")) {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			System.out.println("Command: ");
			command = sc.next();
			String fname ="";
			String lname ="";
			String gender ="";
			String bday ="";
			String title ="";
			String movieyear ="";
			String rating ="";
			String genre ="";
		switch (command) {
			case "1":
				System.out.println("Add an Actor:");
				System.out.println("First Name? ");
					fname = sc.next();
				System.out.println("Last Name?");
					lname = sc.next();
				System.out.println("Gender (Male/Female)? ");
					gender = sc.next(); 
				System.out.println("BirthDate (YYYY-MM-DD)");
					bday = sc.next();
				System.out.println("Actor Summary:");
				System.out.println(fname+" "+lname+", "+gender+", "+bday);
				System.out.println();
			break;
			case "2":
				System.out.println("Add a Movie:");
				System.out.println("Title?");
					title = sc.next();
				System.out.println("Year?");
					movieyear = sc.next();
				System.out.println("Rating?");
					rating = sc.next();
				System.out.println("Genre?");
				sc.nextLine();
					genre = sc.next();
				System.out.println("Movie Summary:");
				System.out.println(title+" "+rating+" was released in "+movieyear+". "+"Genre(s) "+genre );
			break;
			case "3":
				break;
			default:
				System.out.println("Invalid Entery!");
				System.out.println();
			break;	
			}
			
		}
			sc.close();
			System.out.println("Bye");
	}

}
