package business;

public class Pirate {
	private String name;
	private int limbsRemaining;
	public static int numPirates = 0;
	public static int totalLimbsLost = 0;
	
	public Pirate(String name, int limbsRemaining) {
		super();
		this.name = name;
		this.limbsRemaining = limbsRemaining;
		numPirates ++;
	}

	public Pirate(String name) {
		super();
		this.name = name;
		this.limbsRemaining = 4;
		numPirates ++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLimbsRemaining() {
		return limbsRemaining;
	}

	public void setLimbsRemaining(int limbsRemaining) {
		this.limbsRemaining = limbsRemaining;
	}

	public static int getNumPirates() {
		return numPirates;
	}

	public static int getTotalLimbsLost() {
		return totalLimbsLost;
	}
	
	// Method to determine if the pirate is dead.
	// If limbs remaining is negative, pirate is dead.
	public boolean isDead() {
		return (limbsRemaining < 0);
	}
	
	public void loseALimb() {
		if (isDead()) {
			System.out.println(name+" is dead.  Can't lose more limbs!");
		}
		else if (limbsRemaining == 0) {
			limbsRemaining--;
			totalLimbsLost++;
			System.out.println("AAAARGH!!!!  "+name+ " has died.");
		}
		else {
			limbsRemaining--;
			totalLimbsLost++;
			System.out.println("AAAARGH!!!!  "+name+ " says 'I lost me limb!!!!'.");
		}
	}

	@Override
	public String toString() {
		return "Pirate '" + name + "' has "+ 
				limbsRemaining+" limbsRemaining.";
	}
	
	

}
