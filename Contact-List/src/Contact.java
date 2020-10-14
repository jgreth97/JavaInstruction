
public class Contact {
 // define instance variables
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	
	
	//define constructors
	public Contact() {
		super();
}
	//define fully loaded constructor
	public Contact(String firstname, String lastname, String email, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}
	//define getters and setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String displayContact() {
		String str = "------------------------------------------------------------\n";
		str += "--------Current Contact-------------------------------------\n";
		str += "------------------------------------------------------------\n";
str+= "Name:\t\t"+firstname+" "+lastname+"\n";	
str+= "Email Adress:\t"+email+"\n";		
str+= "Phone Number:\t"+phone+"\n";
str+= "------------------------------------------------------------\n";


		return str;
	}
}