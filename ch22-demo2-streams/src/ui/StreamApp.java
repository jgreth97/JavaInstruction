package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import business.Contact;
public class StreamApp {
	public static void main(String[] args) {
		System.out.println("Let's stream!!!");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		//p.717 - use stream to filter and process each contact
		// For each contact in the list without a phone number,
		// print their name
		contacts.stream()
				.filter(c -> c.getPhone() == null)
				.forEach(c -> System.out.println(c.getName()));
		
		// collect filtered elements
		List<Contact> contactsNoPhone = contacts.stream()
				.filter(c -> c.getPhone()==null)
				.collect(Collectors.toList());
		System.out.println("There are "+contactsNoPhone.size()+
				" contacts with no phone number.");
		
		// map - p. 719
		List<String> contactNames = contacts.stream()
				.map(c->c.getName())
				.collect(Collectors.toList());
		contactNames.stream().forEach(str -> System.out.println(str));
		
		System.out.println("the double colon operator...");
		contactNames = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);


		// map & reduce p. 721
		System.out.println("reduce the list down to a single string...");
		String csv = contacts.stream().map(Contact::getName)
				.reduce("", (a,b) -> a + b + ", ");
		csv = csv.substring(0,csv.length()-2);
		System.out.println("All contacts: "+csv);

		System.out.println("bye");

	}
}