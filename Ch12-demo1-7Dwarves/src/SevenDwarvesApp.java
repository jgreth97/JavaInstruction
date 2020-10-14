import java.util.ArrayList;
import java.util.List;

public class SevenDwarvesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hi");

List<String> dwarves = new ArrayList<>();

dwarves.add("Doc");
dwarves.add("Grumpy");
dwarves.add("Happy");
dwarves.add("Sneezy");
//index position = bashful will now be first 
dwarves.add(0,"Bashful");
dwarves.add("Dopey");
dwarves.add("Sleepy");
System.out.println("7 dwarves: "+dwarves);
System.out.println();

//finds object in a position
System.out.println("Dwarf at position 3: "+dwarves.get(3));
System.out.println();

//counts the total objects
System.out.println("# of Dwarves:"+dwarves.size());
System.out.println();

System.out.println("contains Happy"+dwarves.contains("Happy"));
System.out.println();

System.out.println("Idex of Dopey:"+dwarves.indexOf("Dopey"));
System.out.println();

//if there are 2 instances of the same name it will always return the first one if the list
System.out.println(dwarves.add("Grumpy"));
System.out.println("Idex of grumpy"+dwarves.indexOf("Grumpy"));
System.out.println();

dwarves.remove(2);
System.out.println(dwarves);
System.out.println();
System.out.println();


System.out.println("Bye");
	}

}
