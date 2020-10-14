import java.text.NumberFormat;

//the product class follows rules of javaBeans. It is a true POJO(Plain old Java Object)
public class Product implements Printable, Cloneable {
	//fields / instance variables 
	private String code;
	private String description;
	private double price;
	
	//define constructor
	public Product() { 
		
	}
	//constructor - fully loaded constructor 
	//right click line, source, generate constructor using fields 
	public Product(String code, String description, double price) {
	
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	
}
	//getters and setters 
	public String getCode() {
		return code;
	}
	public void setCode(String inCode) {
		code = inCode;
	}
	
	//generated getters and setters
	//right click line, source, generate getters and setters 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;	
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public void print() {
		System.out.println(description);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}