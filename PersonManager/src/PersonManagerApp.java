public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Person Manager App");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getChoiceString("Create Customer or Employee?"+"(c/e): ", "c", "e");
			System.out.println();
			String fname = Console.getString("First Name: ");
			String lname = Console.getString("Last Name: ");

			Person p = null;
			
			if (type.equalsIgnoreCase("c"))
				
			String cNumber = Console.getString("Customer Number: ");
			Customer c = new Customer(fname, lname, cNumber);
			
			p = c;
			
			
			
			choice = Console.getString("Continue ", "y", "n");
		}
		
		
		
		
		
		System.out.println("Bye");
	}

}
