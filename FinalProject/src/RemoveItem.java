import java.util.HashMap;
import java.util.Scanner;

public class RemoveItem extends AddItem{
	public static void removeItem()
	{ 	int key;
		int siz = hm.size();
		if (siz == 0) {
		System.out.println("There is no item to view in the inventory");
		addItem();
		display();
		}

		System.out.println("Select item to place order");
		//Inventory in=new Inventory();
		//in.categories();
		display();
		System.out.println("Brand:");
		Scanner sc = new Scanner(System.in);
		String Brand = sc.nextLine();
		System.out.println("No of items");
		Scanner s1=new Scanner(System.in);
		int noItem=s1.nextInt();
		if(noItem<5)
		{
		for (HashMap.Entry<Integer, Product> entry : hm.entrySet()) {
		key = entry.getKey();
		Product b = entry.getValue();
		if(b.brand.equalsIgnoreCase(Brand) && (noItem<b.quantity))
		b.quantity=b.quantity-noItem;
		else
		System.out.println("Enter valid input");
		}
		for (HashMap.Entry<Integer, Product> entry : hm.entrySet()) {
		key = entry.getKey();
		Product b = entry.getValue();
		System.out.println(key + "\t\t" + b.brand + "\t\t" + b.price + "\t\t" + b.quantity);
		}
		}
		else
		{
		System.out.println("Please enter a number less than 5");
		}
	}	
}

