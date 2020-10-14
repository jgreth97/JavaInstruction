
public class Customer extends Person {

	private String Customernumber;
	
	public Customer() {
		super();
		
	}
	public Customer(String firstName, String lastName, String customernumber) {
		super(firstName, lastName);
		Customernumber = customernumber;

	}


	public String getNumber() {
		return Customernumber;
	}


	public void setNumber(String number) {
		this.Customernumber = number;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Customer Number: "+Customernumber;
	}

	
	
}
