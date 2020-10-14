
package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorDB;
import db.ActorTextFile;
import db.DAO;
import ui.console.Console;

public class BmdbApp {
	
	//private static List<Actor> actors = new ArrayList<>();
	private static DAO<Actor> actorDAO = new ActorDB();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb app!");
		
//		actors.add(new Actor(1, "Clark", "Gable", "M","1901-02-01"));
//		actors.add(new Actor(2, "Chadwick", "Boseman", "M", "1976-11-29"));
//		actors.add(new Actor(3, "Mark", "Hamill", "M", "1951-09-25"));
		
		int command = 0;
		
		while (command!=9) {
			System.out.println("Command Menu:");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Delete Actor");
			System.out.println("5 - Find Actors by Last Name");
			System.out.println("6 - Add Movie");
			System.out.println("9 - Exit");
			System.out.println();
			
			command = Console.getInt("Command:  ");
			System.out.println();
			
			switch(command) {
			case 1:
				//add Actor
				System.out.println("Add an Actor:  ");
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String g = Console.getString("Gender? ");
				String bdStr = Console.getString("Birth Date? ");
				LocalDate bd = LocalDate.parse(bdStr);
				
				Actor actor = new Actor(fn,ln,g,bd);
				actorDAO.add(actor);
				System.out.println("Actor Added!");
				System.out.println(actor.displaySummary());
				System.out.println();
				break;
			case 2:
				// List Actors
				System.out.println("List of all Actors:");
				for (Actor a: actorDAO.getAll()) {
					if (a!=null) { 
						System.out.println(a.displaySummary());
					}
				}
				System.out.println();
				break;
			case 3:
				// Find Actor
				System.out.println("Find an actor by ID:");
				int id = Console.getInt("ID? ");
				Actor a = actorDAO.get(id);
				if (a != null) {
					System.out.println(a.displaySummary());
			}
				else { 
					System.out.println("No actor found by ID!!");
				}
				System.out.println();
				break;
			case 4:
				// delete actor
				System.out.println("Delete an actor by ID:");
				id = Console.getInt("ID? ");
				a = actorDAO.get(id);
				if (a != null) {
					if (actorDAO.delete(a)) {
						System.out.println("Delete successful!");
					}
					else {
						System.out.println("Error deleting actor.");
					}
				}
				else {
					System.out.println("No actor found for id: "+id);
				}
				System.out.println();
				break;
			case 5:
				System.out.println("Enter an actors last name: ");
				String lname = Console.getLine("Last Name? ");
				List<Actor> actors = actorDAO.findbylname(lname);
				
				System.out.println("Actors: ");
				if (actors.size()==0){
				System.out.println("No actors with last name: "+lname);
			}
				else {
				for (Actor act: actors) {
					System.out.println(act.displaySummary());
			}
				
				}
				
				
				break;
			case 6:
				// add Movie
				System.out.println("Add a Movie:  ");
				String t = Console.getLine("Title? ");
				String y = Console.getString("Year? ");
				String r = Console.getString("Rating? ");
				String gr = Console.getString("Genre? ");
				
				Movie movie = new Movie(t,y,r,gr);
				System.out.println(movie.displaySummary());
				System.out.println();
				break;
			
			case 9:
				// exit..  do nothing
				break;
			default:
				System.out.println("Invalid Command.  Try Again.");
				break;
			
			}
			
		}

		System.out.println("bye");
	}

}

