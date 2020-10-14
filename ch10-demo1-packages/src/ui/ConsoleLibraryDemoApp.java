package ui;

import ui.console.Console;

public class ConsoleLibraryDemoApp {

	public static void main(String[] args) {
System.out.println("Hello");

String str = Console.getLine("Enter a Sentence");

int n = Console.getInt("Enter a number between 1-10:", 1,10);

System.out.println("Bye");
	}

}
