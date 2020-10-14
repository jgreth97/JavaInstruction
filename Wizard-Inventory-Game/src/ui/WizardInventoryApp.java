package ui;

import java.util.ArrayList;
import java.util.List;

import ui.console.Console;

public class WizardInventoryApp {

	private static List<String> items = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Wizard Inventory App!");
		initializeItems();

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command:  ");
			switch (command) {
			case "show":
				// show / list all items
				for (int i = 0; i < items.size(); i++) {
					System.out.println(i + 1 + ". " + items.get(i));
				}
				System.out.println();
				break;
			case "grab":
				// grab / add item, but max of 4
				if (items.size() >= 4) {
					System.out.println("You can't carry anymore items.  Please drop one first.");
				} else {
					String name = Console.getLine("Name: ");
					items.add(name);
					System.out.println(name + " was added.");
				}
				break;
			case "edit":
				// edit - prompt for item # (not the index!!!)
				String item = findItem();
				int idx = items.indexOf(item);
				String newName = Console.getLine("Updated name: ");
				items.set(idx, newName);
				System.out.println("Item #"+(idx+1)+ " was updated.");
				break;
			case "drop":
				// drop
				int itemNbr = Console.getInt("Number: ",1,items.size());
				String itemRemoved = items.remove(itemNbr-1);
				System.out.println(itemRemoved + " was removed.");
				break;
			case "exit":
				// exit
				break;
			}

		}

		System.out.println("Bye");

	}

	private static void initializeItems() {
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
	}

	private static void displayMenu() {
		String menu = "COMMAND MENU:\n" + "show - Show all items\n" + "grab - Grab (add) an item\n"
				+ "edit - Edit an item\n" + "drop - Drop an item\n" + "exit - Exit app\n";
		System.out.println(menu);
	}

	private static String findItem() {
		int itemNbr = Console.getInt("Number: ",1,items.size());
		String item = items.get(itemNbr-1);		
		return item;
	}

}
