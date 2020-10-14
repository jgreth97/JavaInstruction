package ui;
import java.util.ArrayList;
import java.util.List;
import business.Actor;
import business.MovieClass;
import ui.console.Console;
import business.Actor;
public class Bmdb2ClassApp {
		
	
private static List<Actor> actors = new ArrayList<>();


public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		System.out.println();	
		
		
		
	actors.add(new Actor(1, "Clark", "Gable", "M", "1901-02-01"));
	actors.add(new Actor(2, "Chadwick", "Boseman", "M", "1976-11-29"));
	actors.add(new Actor(3, "Mark", "Hamill", "M", "1951-09-25"));

	int command = 0;
		while(command != 9) {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Find Actor");
			System.out.println("4 - List Actors");

			System.out.println("9 - Exit");
			System.out.println();
			command = Console.getInt("Command: ");
			String fname ="";
			String lname ="";
			String gender ="";
			String bday ="";
			String title ="";
			String movieyear ="";
			String rating ="";
			String genre ="";
		switch (command) {
			case 1:
				System.out.println("Add an Actor:");
				int id = Console.getInt("ID: ");
					fname = Console.getString("First Name? ");
					lname = Console.getString("Last Name? ");
					gender = Console.getString("Gender (Male/Female)?");
					bday = Console.getString("BirthDate (YYYY-MM-DD)");
					
				Actor a = new Actor(id,fname, lname, gender, bday);
				System.out.println();
				actors.add(a);
				System.out.println("Actor Added!");
				System.out.println(a.displaySummary());
			break;
			
			case 2:
				System.out.println("Add a Movie:");
					title = Console.getString("Title: ");
					movieyear = Console.getString("Year ");
					rating = Console.getString("Rating? ");				
					genre = Console.getLine("Genre ");
					MovieClass movie = new MovieClass(title, movieyear,rating, genre);
				System.out.println(movie.displaySummary());
			break;
			
			case 3:
				System.out.println("Find an Actor by id: ");
				id = Console.getInt("ID:");
				for (Actor a1: actors) {
					if(a1!= null && a1.getId()==id) {
						System.out.println("Actor Found! ");
						System.out.println(a1.displaySummary());
					break;
					}
				}
			System.out.println();
		
			
			case 4:
				System.out.println("List Actors");
					for (Actor a1: actors){
						if(a1!=null) {
						a1.displaySummary();
						}
					}
			System.out.println();
			break;
			
			
			
			case 9: 
				break;
			default:
				System.out.println("Invalid Entery!");
				System.out.println();
			break;	
			}
			
		}
			
			System.out.println("Bye");
	}

}
