
public class ProductManagerApp {

	public static void main(String[] args) {
System.out.println("Hello");

Product p1 = new Product("java", "Murachs Java Programming", 57.50);
System.out.println(p1);
//Same thing^^^^^
//System.out.println(p1.toString());
Book b1 = new Book("mysql", "Murachs MySql", 54.50, "Joel Murahc");
System.out.println(b1);

Software s1 = new Software("eclipse,","STS Eclipse", 0.0, "4.6.1.release");
System.out.println(s1);


//________Polymorphism__________
//Product p2 =s1;
//System.out.println("p2 to string");
//System.out.println(p2);
//______________________________



System.out.println("Goodbye");
	}

}
