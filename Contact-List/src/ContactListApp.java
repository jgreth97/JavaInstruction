
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List");

		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println();
			String firstname = Console.getString("Enter firstname: ");
			String lastname = Console.getString("Enter lastname: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");
			System.out.println();
			
			//Contact.displayContact();
			Contact c = new Contact(firstname,lastname,email,phone);
			
			System.out.println(c.displayContact());
			System.out.println();
			choice = Console.getString("Continue? (y/n)");

		}
		
		System.out.println("Bye");
	}

}
