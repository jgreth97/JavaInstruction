import java.util.Scanner;

public class Primitivesapp {

	public static void main(String[] args) {
System.out.println("Unicode Character Converter");
Scanner sc = new Scanner(System.in);
String choice = "y";
while (choice.equalsIgnoreCase("y")) {
	System.out.println("Enter a chacter #: ");
	int charNum = sc.nextInt();
	char charval = (char)charNum;

	System.out.println("Character equivilent: "+charval);
	System.out.println();

System.out.println("Again? (y/n)");
choice = sc.next();
	}
sc.close();
System.out.println("Bye");
	}

}
