
public class StringsApp {

	public static void main(String[] args) {
System.out.println("HI");

String name = "Eddie Van Halen";
System.out.println(name + " is "+name.length()+" characters long");
int idx1 = name.indexOf(" ");
System.out.println(idx1);
int idx2 = name.indexOf(" ",6);
System.out.println(idx2);
String fname =name.substring(0,idx1);
String mname =name.substring(idx1+1,idx2);
String lname =name.substring(idx2+1);
System.out.println("fname = "+fname);
System.out.println("mname = "+mname);
System.out.println("lname = "+lname);





String name1 = "Bob Marley           ";
name1=name1.trim();//cuts out all the white space
System.out.println(name1+".");
String bob = name1.substring(0,3);
System.out.println("firstname = "+bob);

name1 = name1.replace(" ", "-");//replaces the space with a dash
System.out.println(name1);
String sentence = "Is it time for lunch yet?";
String[] words =sentence.split(" ");
 for(String s: words) {
	 System.out.println(s);
 }
StringBuilder sentence2 = new StringBuilder();
sentence2.append("Hello, ");
sentence2.append("how ");
sentence2.append("are ");
sentence2.append("you?");
System.out.println(sentence2);
System.out.println("Capcaity = "+sentence2.capacity());
System.out.println("length = "+sentence2.length());

sentence2.insert(7, "Dolly ");
System.out.println(sentence2);


System.out.println("Bye");
	}

}
