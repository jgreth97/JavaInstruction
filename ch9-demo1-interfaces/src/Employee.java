public class Employee extends Person implements Printable, DepartmentConstants{
	private String ssn;
	private int department;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn, int dept) {
		super(firstName, lastName);
		this.ssn = ssn;
		this.department = dept;
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

	@Override
	public void print() {
		String dept ="Unknown";
		if (department == ADMIN) {
			dept = "Administration";
		}
		else if (department == EDITORIAL) {
			dept = "Editorial";
		}
		else if (department == MARKETING) {
			dept = "Marketing";
		}
		
		System.out.println(firstName+ " "+ lastName+" ("+ dept+ ")");
		
	}
	
	

}