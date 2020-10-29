package ui;

import java.util.ArrayList;

import java.util.List;

import business.Pirate;

public class PirateFightApp {
	private static List<Pirate> pirates = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println("Welcome to the pirate fight app");
		
		pirates.add(new Pirate("BlackBeard"));
		pirates.add(new Pirate("Jack Sparrow"));
		pirates.add(new Pirate("Captain Hook"));
		pirates.add(new Pirate("Willie Stargill"));
		pirates.add(new Pirate("Long John Silver"));

		printPirateStats();
		for (int i=0; i<10;i++) {
			int pirateIdx = genRandomIndex();
		    Pirate p = pirates.get(pirateIdx);
		    p.loseALimb();
		    if (p.isDead()) {
		    	pirates.remove(p);
		    }
		
		}
		System.out.println("Bye");
	}
	private static int genRandomIndex() {
		int r = (int)(Math.random()*pirates.size());
		return r;
	}
	private static void printPirateStats() {
		System.out.println("****Pirate Stats****");
		System.out.println("Total Pirates: "+ Pirate.numPirates);
		System.out.println("Total Limbs Lost: "+ Pirate.totalLimbsLost);
		for (Pirate p: pirates) {
			System.out.println(p);
		}
		System.out.println("**********************");
	
}
}