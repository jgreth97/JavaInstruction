import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SevenDwarvesHashMapApp {

	public static void main(String[] args) {
		System.out.println("Hi");

		HashMap<String, String> dwarves = new HashMap<>();
		
		//           key, object
		dwarves.put("DC", "Doc");
		dwarves.put("SL", "Sleepy");
		dwarves.put("SN", "Sneezy");
		dwarves.put("BA", "Bashful");
		dwarves.put("DO", "Dopey");
		dwarves.put("HA", "Happy");
		dwarves.put("GR", "Grumpy");
System.out.println("List of all dwarves: ");
		for (Entry<String, String> dwarf: dwarves.entrySet()){
			System.out.println(dwarf.getKey()+"\t"+dwarf.getValue());
		}
		//Look up dwarf name
		String str = "SN";
		System.out.println("Dwarf SN is "+dwarves.get(str));
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("Bey");
	}

}
