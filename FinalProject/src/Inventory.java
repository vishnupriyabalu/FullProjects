import java.util.Scanner;
public class Inventory extends AddItem {
	

	

	public static void categories()
	{
		int siz = hm.size();
		if (siz == 0) {
		System.out.println("There is no item to view in the inventory\n Please add new items");
		addItem();
		display();
		}
		else {
		display();
		}
		System.out.println("Do you want to go to main menu"
				+ "1---Yes"
				+ "2--No");
		Scanner s2=new Scanner(System.in);
		int x = s2.nextInt();
		switch(x)
		{
		case 1:
			Initial.start();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Enter valid input");
			
		}
		

		
	}

}
