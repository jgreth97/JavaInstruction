package business;

import java.time.LocalDate;

public class Actor {
	
	private static Actor[] actors = new Actor[100];

	
	
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private LocalDate birthdate;
	
		public Actor(int id) {
		super();
		this.id = id;
	}
	
	public Actor() {
		super();
	}
	
	


	public Actor(int id, String firstname, String lastname, String gender, LocalDate birthdate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getbirthDate() {
		return birthdate;
	}

	public void setbirthDate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public String displaySummary() {
		String str = ("ID; "+id+" "+firstname+" "+lastname+", "+(gender.equalsIgnoreCase("M") ? "Male": "Female")+" "+"born in "+birthdate );
		
		return str;
	}

	public Actor(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	

}

