import java.util.Scanner;

public class Product {
	public int quantity, price;
	public String brand;
	Scanner sc=new Scanner(System.in);

	public static int id=0;

	public int getId() {
		return id;
	}

	String getBrand() {
		return brand;
	}

	int getQuantity() {
		return quantity;
	}

	int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	  public void setId(int id) {
		  Product.id = id; }
	 

	public Product(String brand, int price, int quantity) {
		setId(id);
		setBrand(brand);
		setQuantity(quantity);
		setPrice(price);
	}
	

	// public void setData()
	// {

	// LinkedList<String> ll=new LinkedList<String>();

	// ll.add(arg0)

	// }

}

