import java.util.Scanner;

public class ifstatmentsApp {

	public static void main(String[] args) {

		String color = "yellow";
		//if statement with braces
		
		if(color.equalsIgnoreCase("red")) {
		System.out.println("color is red");
		System.out.println("Hey there");//part of if statement
	}
			//if statement without braces 
		if(color.equalsIgnoreCase("red")) {
			System.out.println("color is red");
		}
		System.out.println("hello");//not part of if statement 
		
		int total = 100;
		if (total == 50) {
			System.out.println("total is 50");
	}
		else if  (total < 50) {
			System.out.println("total is greater than 50");
		}
		
		else if  (total < 50) {
			System.out.println("total is less than 50");
		}
		if (total >= 75) {
			System.out.println("total is greater than or equal to 75");
		}
		else if  (total <+ 75) {
			System.out.println("total is less than or equal to 75");
	}
		if (total != 0) {
			System.out.println("total is not equal to 0");
		}
		int distancefromlight = 30;//yard to stop sign
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Light is red.. stop");}
		else if (color.equalsIgnoreCase("green")) {
			System.out.println("Light is green.. go");
		}
		/*else if (color.equalsIgnoreCase("yellow") && distancefromlight > 30) {
			System.out.println("Light is yellow and far away... slow down");
		}
		else if (color.equalsIgnoreCase("yellow") && distancefromlight <= 30) {
			System.out.println("Light is yellow and close... speed up");*/
	
		else if (color.equalsIgnoreCase("yellow")) {
		}
			if (distancefromlight> 30) {
				System.out.println("Light is yellow and far away... slow down");
			}

			else if (distancefromlight <= 30) {
				System.out.println("Light is yellow and far away... slow down");
			}
		else { System.out.println("Error - invalid light color");
		}
		int favnum = 10;
		if (favnum ==10 || favnum ==11) {
			System.out.println("# is 10 or 21");
		}
		else {
			System.out.println("3 is not 10 or 21");
		}
		
		int n1=0;
		int n2=0;
if (favnum ==10) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 2 numbers on one line: ");
	 n1 =sc.nextInt();
	 n2 = sc.nextInt();
}
int sum = n1 + n2;
System.out.println("sum = "+sum);
			
}
		}
	
	
	



