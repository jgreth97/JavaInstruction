import java.util.ArrayList;

public class NumberListApp {

	public static void main(String[] args) {
System.out.println("Hi");

ArrayList<Integer>numbers = new ArrayList<>();
numbers.add(5); //position 0
numbers.add(15);
numbers.add(20);
numbers.add(25);//position 3

System.out.println(numbers);

numbers.add(1,10);
System.out.println(numbers);
System.out.println(numbers.get(2));






System.out.println("Bye");

	}

}
