
public class Sheep extends Animal implements Countable{

	private Sheep wool;

	public Sheep() {
		super();
	}

	public Sheep(Sheep wool) {
		super();
		this.wool = wool;
	}

	public Sheep getWool() {
		return wool;
	}

	public void setWool(Sheep wool) {
		this.wool = wool;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
