package ui;

import java.util.*;
import java.util.function.*;

import business.Contact;
import business.TestContact;

public class ContactManagerApp {

	public static void main(String[] args) {
		// pp. 702 - 705
		System.out.println("Welcome to the Contact Manager App!");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		System.out.println("All Contacts:");
		displayContacts(contacts);
		
		System.out.println("Contacts without phone numbers:");
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsWithoutPhone.add(c);
			}
		}
		displayContacts(contactsWithoutPhone);
		
		System.out.println("Contacts without email addresses:");
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null) {
				contactsWithoutEmail.add(c);
			}
		}
		displayContacts(contactsWithoutEmail);
		
		System.out.println("=====  using Lambdas =====");
		System.out.println("no phone");
		contactsWithoutPhone = filterContacts(contacts, 
				(Contact c) -> {return c.getPhone()==null;});
		displayContacts(contactsWithoutPhone);
		
		System.out.println("no email");
		contactsWithoutEmail = filterContacts(contacts,
				c -> c.getEmail()==null);
		displayContacts(contactsWithoutEmail);
		
		System.out.println("no email, no phone");
		List<Contact> contactsWithoutEmailPhone = filterContacts(contacts,
				c -> c.getEmail()==null && c.getPhone()==null);
		displayContacts(contactsWithoutEmailPhone);
		
		System.out.println("=====  using Predicate =====");
		System.out.println("no phone");
		contactsWithoutPhone = filterContactsPredicate(contacts, 
				(Contact c) -> {return c.getPhone()==null;});
		displayContacts(contactsWithoutPhone);
		
		System.out.println("=====  using Consumer =====");
		processContacts(contacts, 
				c -> System.out.println(c.getName()));
		processContacts(contacts, 
				c -> System.out.println(c.getEmail()));
		processContacts(contacts, 
				c -> System.out.println(c.getPhone()));
		// using Consumer without a method...
//		Consumer<Contact> consumer = (Contact c) -> System.out.println(c.getPhone());
//		for (Contact c: contacts) {
//			consumer.accept(c);
//		}
		System.out.println("=====  using Function =====");
		List<String> contactPhoneNumbers = transformContacts(contacts,
				c -> {
						String phone = (c.getPhone() == null)?"n/a":c.getPhone();
						return c.getName() + ": " + phone;
		});
		System.out.println(contactPhoneNumbers);
		
		
		System.out.println("Bye");

	}
	
	private static void displayContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
		System.out.println();
	}
	
	public static List<Contact> filterContacts(List<Contact> contacts,
			TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	// Predicate Interface - p. 709
	public static List<Contact> filterContactsPredicate(List<Contact> contacts,
								Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c))
				filteredContacts.add(c);
		}
		
		return filteredContacts;
		
	}
	
	// Consumer Interface - p. 711
	public static void processContacts(List<Contact> contacts,
								Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
	
	// Function Interface - p.713
	public static List<String> transformContacts(List<Contact> contacts,
								Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c: contacts) {
			strings.add(function.apply(c));
		}
		return strings;
	}
	
	
	
	
	
	
	
	
	
	
	

}
