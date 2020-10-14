import ui.console.Console;

public class PiglayAtinayApp {

	public static void main(String[] args) {
System.out.println("Welcome to the pig latin translator!");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			
			String line = Console.getLine("Enter a line: ");
			
			//1) Split sentence into words array
			String[] words = line.split(" "); 
			//String[] translation = new String[words.length];
				for (String str : words) {
					str.toLowerCase();
					removePunc(str);
					if (!isAllLetters(str)) {
						translate(str);
					}
					
					break;
				}
			
			//2) change to lower case
				
				
				
			//3a) Don't translate words w/ special symbols or numbers
			
				
				
			//3b) Remove punctuation at the end of each word

				
				
			//4a) For each word move the starting consonant to the back 
			
				
				
			//4b) If starts with a y move y to the end
			
			
			
			
			choice = Console.getChoiceString("Another line?", "(Y)", "(N)");
		}
		System.out.println("Bye");
		
	}
	private static void translate(String str) {
	
	}
	
	//check to make sure its all letters
		private static boolean isAllLetters(String str) {
			boolean allLetters = true;
			char[] chars = str.toCharArray();
				for (int i = 0; i < chars.length; i++) {
					char c = chars[i];
					if (!Character.isLetter(c) && (!(i==(chars.length -1)))) {
						allLetters = false;
						break;
					}
					else if (!Character.isLetter(c) && (!(i==(chars.length -1))));
				}
			
			return allLetters;
		}
		private static void removePunc(String str) { 
			char c = str.charAt(str.length()-1);
			if (c =='.' || c=='!' || c=='?') {
				str = str.substring(0,str.length()-1);
			}
		}
}
