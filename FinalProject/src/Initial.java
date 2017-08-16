import java.awt.event.AdjustmentEvent;
import java.util.Scanner;

public class Initial {
	private static Scanner sc;
//	static Adjust ad=new Adjust();

	public static void start()
	{
		int a;
		System.out.println("Choose the option you want to perform:\n"
				+ "1--View Inventory\n"
				+ "2--Adjust inventory\n"
				+ "3--Add Stock\n"
				+ "4--Place order\n");
		sc = new Scanner(System.in);
		a = sc.nextInt();
		switch(a)
		{
		case 1:
			
			Inventory i=new Inventory();
			i.categories();
			break;
		case 2:
			AddItem.addItem();
			break;
		case 3:
			AddItem.addItem();
			break;
		case 4:
			RemoveItem.removeItem();
			break;
		default:
			System.out.println("Enter options"
					+ " between 1 to 4");
			break;
		}
		start();
		
		
	}

}

