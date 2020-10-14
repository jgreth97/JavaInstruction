
public class Alligator extends Animal{
private String sharpTeeth;

public Alligator() {
	super();
}

public Alligator(String sharpTeeth) {
	super();
	this.sharpTeeth = sharpTeeth;
}

public String getSharpTeeth() {
	return sharpTeeth;
}

public void setSharpTeeth(String sharpTeeth) {
	this.sharpTeeth = sharpTeeth;
}

@Override
public String toString() {
	return "Alligators have very sharp teeth";
}


}
