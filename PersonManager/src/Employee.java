public class Employee extends Person implements Printable{
	private String ssn;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"SSN:  XXX-XX-"+ssn.substring(7);
	}
	
	

}