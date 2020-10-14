
public class TernaryOpporatorApp {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		
		//Actor example M or F
		//if gender = M, genderDisplay = "Male"
		//if gender = F, genderDisplay = "Female"
		//Output: "The actors gender is Female"
	//***********************************************	
		String gender = "F";
		String genderDisplay ="";
		
	
		if (gender.equalsIgnoreCase("M")) {
			genderDisplay = "Male";
		}
		else {
			genderDisplay = "Female";
		}
		System.out.println("The acotrs gender is: "+genderDisplay);
	//non ternary way*******************************
		
		System.out.println();
		System.out.println("Ternary Opporator");  //If ture    If False
		genderDisplay = gender.equalsIgnoreCase("M") ? "Male" : "Female";
		
		System.out.println("The acotrs gender is: "+genderDisplay);

		
		
		
		System.out.println("bye");
	}

}
