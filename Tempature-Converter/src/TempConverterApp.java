import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Tempature Converter");
		System.out.println();
	
	Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	
	while (choice.equalsIgnoreCase("y")) {
	System.out.print("Enter degree in Farenhiet: ");
	
	double far = sc.nextDouble();
	System.out.println(far);
	
	double cel = (far-32) * 5/9;
	System.out.println(cel);
	NumberFormat far1 = NumberFormat.getInstance();
	far1.setMaximumFractionDigits(2);
	
	System.out.println("Degree Celcius: "+ far1.format(cel));
	
	System.out.print("Continue? (y/n)" );
	choice = sc.next();
	}
	System.out.println("Goodbye");
	

	sc.close();
	}
	

}
