package db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Path.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import business.Product;

public class ProductTextFile implements DAO<Product> {
	private List <Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String FIELD_SEP= "\t";
	

	public ProductTextFile() {
		productsPath = Paths.get("products.txt");
		productsFile = productsPath.toFile();
		products = getAll();
	}

	@Override
	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
	if (products != null) {
		return products;
	}
	products = new ArrayList<>();
	if (Files.exists(productsPath)) {
		try(BufferedReader in  = new BufferedReader(
								new FileReader(productsFile))){
			//read products from file into our list
			String line = in.readLine();
			while (line != null) {
			String[] fields = line.split(FIELD_SEP);
			String code = fields[0];
			String description = fields[1];
			String price = fields[2];
			
			Product p = new Product(
					code, description, Double.parseDouble(price));
			products.add(p);
			line = in.readLine();
			}
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return null;
		}
	}
	else { System.out.println(productsPath.toAbsolutePath()+"doesnt exist.");
	return null;
	}
	return products; 
	}
// get all products from txt file if our list is null
	@Override
	public boolean add(Product p) {
		products.add(p);
		return saveAll();
	}

	@Override
	public boolean update(Product p) {
//get old product and return it		
		Product oldProduct = this.get(p.getCode());
		int i = products.indexOf(oldProduct);
		products.remove(i);
		products.add(i,p);
		return saveAll();
	}

	@Override
	public boolean delete(Product p) {
products.remove(p);
		return saveAll();
	}
	
	private boolean saveAll() {
		
		try
			(PrintWriter out = new PrintWriter(
								new BufferedWriter(
								new FileWriter(productsFile)))){
				for (Product p: products) {
					out.print(p.getCode()+FIELD_SEP);
					out.print(p.getDescription()+FIELD_SEP);
					out.println(p.getPrice());
				}
				return true;
			}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

}
