import java.util.Scanner;

public class Test3 extends Test2
{
	
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Inside main method");
	System.out.println("Enter a value:");
	int n=scan.nextInt();
	int res=Test2.AddOne(n);
	System.out.println(res);
}
}
