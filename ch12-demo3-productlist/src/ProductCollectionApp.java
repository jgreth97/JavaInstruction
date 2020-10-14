import java.util.ArrayList;

public class ProductCollectionApp {

	public static void main(String[] args) {
System.out.println("Hi");

ArrayList<Product> products = new ArrayList<>();

products.add(new Product("java", "murachs java",57.50));
products.add(new Product("andr", "murachs Android",57.50));
products.add(new Product("mysql", "murachs MySQL",57.50));

String code = "andr";
for (Product p: products) {
	if(p.getCode().equalsIgnoreCase(code)){
		System.out.println("product Found: "+p.toString());
		System.out.println("Index Position: "+products.indexOf(p));
	}
}
	




System.out.println("bye");
	}

}
