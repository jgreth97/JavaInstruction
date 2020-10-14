package db;

import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Path.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import business.Actor;

public class ActorTextFile implements DAO<Actor> {
	private List <Actor> actors = null;
	private Path actorsPath = null;
	private File actorsFile = null;
	private final String FIELD_SEP= "\t";
	

	public ActorTextFile() {
		actorsPath = Paths.get("Actor.txt");
		actorsFile = actorsPath.toFile();
		actors = getAll();
	}

	
	@Override
	public Actor get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Actor> getAll() {
	if (actors != null) {
		return actors;
	}
	actors = new ArrayList<>();
	if (Files.exists(actorsPath)) {
		try(BufferedReader in  = new BufferedReader(
								new FileReader(actorsFile))){
			//read products from file into our list
			String line = in.readLine();
			while (line != null) {
			String[] fields = line.split(FIELD_SEP);
			
			String idStr = fields[0];
			int id = Integer.parseInt(idStr);
			String firstname = fields[1];
			String lastname = fields[2];
			String gender = fields[3];
			String birthDatestr = fields[4];
			LocalDate birthDate = LocalDate.parse(birthDatestr);
			Actor a = new Actor(id, firstname, lastname, gender, birthDate);
			actors.add(a);
			line = in.readLine();
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return null;
		}
	}
	else { System.out.println(actorsPath.toAbsolutePath()+"doesnt exist.");
	return null;
	}
	return actors; 
	}
// get all products from txt file if our list is null
	@Override
	public boolean add(Actor a) {
		actors.add(a);
		return saveAll();
	}

	@Override
	public boolean update(Actor a) {
//get old product and return it		
		Actor oldActor = this.get(a.getId());
		int i = actors.indexOf(oldActor);
		actors.remove(i);
		actors.add(i,a);
		return saveAll();
	}

	@Override
	public boolean delete(Actor a) {
actors.remove(a);
		return saveAll();
	}
	
	private boolean saveAll() {
		
		try
			(PrintWriter out = new PrintWriter(
								new BufferedWriter(
								new FileWriter(actorsFile)))){
				for (Actor a: actors) {
					out.print(a.getFirstname()+FIELD_SEP);
					out.print(a.getLastname()+FIELD_SEP);
					out.println(a.getGender()+FIELD_SEP);
					
				}
				return true;
			}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}


	}


