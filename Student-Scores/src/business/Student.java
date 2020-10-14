package business;

public class Student implements Comparable {

	private String fname;
	private String lname;
	private int Score; 

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;		
	}

	public Student(String fname, String lname, int score) {
		super();
		this.fname = fname;
		this.lname = lname;
		Score = score;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
	


	
}
