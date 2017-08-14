
/*
 * Vishnupriya
 * 4 Aug 2017
 * Adding 2 varibles and checks the result with 6 
 */
import static java .lang.System.out;
public class Test1 {
 public static int addOne(int a)
 { 
	 return ++a;
 }
 public static void main(String args[])
 {
	 int a=5;
	 int result=Test1.addOne(a);
	 out.println("Adding two variables 'a' resuls in" +result);
	 if(result==6)
		 System.out.println("Test Passes");
	 else
		 System.out.println("Test Fails");
 }
}
