import java.util.Scanner;

public class ReplaceVowelsApp {

	public static void main(String[] args) {
		
		//prompt user for a string, replace all vowels with '*',
		//and return the string 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				str = str.replace(c[i], '*');
			}
		}
		System.out.println(str);
		
		System.out.println("try again using regular expresions...");
		System.out.println();
		System.out.println("Enter another String:");
		
		str = sc.nextLine();
		str = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(str);
		
	}

}
