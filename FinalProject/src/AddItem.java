import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.util.Types;


public class AddItem  {
	
//	Types ty=new Types();
	static Product b;
	public static HashMap<Integer, Product> hm = new HashMap<Integer, Product>();
	static Scanner sc=new Scanner(System.in);
	public static void addItem()
	{
		System.out.println("you are inside Additem method");
		System.out.println("1.you want to enter new product\n 2.Modify existing Product");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		switch(n) {
		case 1:
		System.out.println("Number of items u want to add:");
		//Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println("Enter the item u want to add");
		
		for (int i = 0; i < no; i++) {
			getItemDesc();
			int j = i;
		while (j < 10) {
		if (hm.containsKey(i)) {
		i++;
		}
		j++;
		}
		hm.put(i, b);
		
		}
		break;
		case 2:
			System.out.println("Enter the product name you want to modify");
			
			
            int key;
	int size = hm.size();
	if (size == 0) {
	System.out.println("There is no item to view in the inventory");
	addItem();
	display();
	}

	System.out.println("Select item to adjust Inventory");
	//Inventory in=new Inventory();
	//in.categories();
	display();
	System.out.println("Brand:");
	Scanner sc = new Scanner(System.in);
	String Brand = sc.nextLine();
	//System.out.println("No of items you want to enter");
	//Scanner s1=new Scanner(System.in);
	//int noItem=s1.nextInt();
	//if(noItem<5)
	//{
	for (HashMap.Entry<Integer, Product> entry : hm.entrySet()) {
	key = entry.getKey();
	Product b = entry.getValue();
	if(b.brand.equalsIgnoreCase(Brand))
	{int num;
	num= b.quantity;
	
    System.out.println("Number of quantities already present in that Brand:"+num);
System.out.println("No of items you want to enter");
	Scanner ss=new Scanner(System.in);
	int n2=ss.nextInt();
	b.setQuantity(n2);
		}
		}
	break;
	
}		
		}
	
		static void display() {
		System.out.println("ID \t\tBrand \t\tPrice \t\tQuantity");
		for (HashMap.Entry<Integer, Product> entry : hm.entrySet()) {
		int key = entry.getKey();
		Product b = entry.getValue();
		System.out.println(key + "\t\t" + b.brand + "\t\t" + b.price + "\t\t" + b.quantity);
		}

		}
	public static void getItemDesc()
	{
		System.out.println("Enter the Product:");
		String br=sc.next();
		System.out.println("Enter the Product price:");
		int pr=sc.nextInt();
		try {
			if(pr<=127)
				pr=pr;	
		}
		catch(Exception e)
		{
			System.out.println("arithmetic exception caught!!!enter a number of integer type");
		}
		System.out.println("Enter the Product quantity:");
		int qu=sc.nextInt();
	
		try {
			if(qu<=127)
				b=new Product(br,pr,qu);	
		}
		catch(Exception e)
		{
			System.out.println("arithmetic exception caught!!!enter a number of integer type");
		}
			
	}
	
	
	
	
	
	

}

