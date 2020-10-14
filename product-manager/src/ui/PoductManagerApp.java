package ui;

import java.util.List;

import business.Product;
import db.DAO;
import db.ProductTextFile;
import ui.console.Console;

public class PoductManagerApp {
private static DAO<Product> productDAO = new ProductTextFile();
	public static void main(String[] args) {
System.out.println("Welcome to the product manager");

	int command = 0;
	while (!(command==9)){
		System.out.println("MENU");
		System.out.println("1 - list products");
		System.out.println("2 - add product");
		System.out.println("9 - exit");
		System.out.println();
		command = Console.getInt("Command?: ", 0,10);
		
		switch (command) {
		case 1:
			List<Product> products = productDAO.getAll();
			for (Product p: products) {
			System.out.println(p);
		}
			break;
		case 2:
			
			System.out.println("Add a product");
			String code = Console.getRequiredString("Code? ");
			String description = Console.getRequiredString("Description?");
			double price = Console.getDouble("Price? ");
			Product p = new Product(code, description, price);
			if (productDAO.add(p)) {
				System.out.println("Products added succefully");
	}
			else {
				System.out.println("Issue adding product");
		}
		System.out.println();
		break;
		case 9:
			break;
	}
		}
	System.out.println("bye");
		}
	
}

