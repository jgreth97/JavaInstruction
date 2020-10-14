package ui;

import java.util.Arrays;

import business.Product;


public class ArrayDemoApp {

	public static void main(String[] args) {
System.out.println("Hello");

//array of 5
int[] numbers = new int[5];
numbers[0]=5;
numbers[1]=10;
numbers[2]=15;
numbers[3]=20;
numbers[4]=25;

for (int i=0; i < numbers.length; i++) {
	System.out.println(numbers[i]);

	
}

//array of random nums

int[]randNbrs = new int[100];
for (int i=0; i < randNbrs.length; i++) {
	int r = (int)(Math.random()*100)+1;
	randNbrs[i] = r;
	System.out.println(r);
}

//array of strings
String[]names = {"Sean", "Jack", "Johnathan", "Tanya", "Mark","Hung", "Kali","Ommaimah"};
for (int i=0; i<names.length; i++) {
System.out.println(names[i]);
}

//array of products 
Product p1 = new Product("java", "murahcs java", 57.50);
Product p2 = new Product("java", "murahcs mysql", 57.50);
Product p3 = new Product("Android", "Murachs android", 56.50);

Product[] products = {p1,p2,p3};

//for loop
//for (int i=0; i<products.length;i++) {
//System.out.println(products[i]);
//}

//enhanced for loop
for (Product product: products) {
	System.out.println(product);
}


//arrays class*******
//sort names
Arrays.sort(names);
for(String name: names ) {
	System.out.println(name);
}
//binary search returns an int
int position = Arrays.binarySearch(names, "Jack");

//sort products
Arrays.sort(products);
for (Product p: products) {
	System.out.println(p);
}

System.out.println("bye");


	}

}
