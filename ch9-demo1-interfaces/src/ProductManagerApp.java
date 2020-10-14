
public class ProductManagerApp {

	public static void main(String[] args) throws CloneNotSupportedException {

	 System.out.println("Hello");
		 Product p = new Product("java", "Murachs java", 57.50);
		 p.print();
		 Employee e = new Employee ("Harry", "Syles", "111-111-1111",2) ;
		  
		 
		 printMultiple(p,5);
		 printMultiple(e,3);
		 
		 Product p1= new Product("java", "Murachs java", 57.50);
		 Product p2 = (Product)p1.clone();
		 p1.print();
		 p2.print();
		 
		 System.out.println("bye");
		  
		  }
	private static void printMultiple(Printable p, int count) {
			  for (int i=0; i <count;i++) {
				  
				  p.print();		 
		  }
		
	}

}
