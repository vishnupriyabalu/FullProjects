
import static java.lang.System.out;

public class TestStringReverser {

	public static void main(String args[]) {


 String case1 = "Hello world";
 String case2 = "This is a test.";
 String case3 = "abc def";
 
 String expected1 = "dlrow olleH";
 String expected2 = ".tset a si sihT";
String expected3 = "fed cba";
// perform the operations and get the actual results
String result1 = StringReverser.reverse(case1);
 String result2 = StringReverser.reverse(case2);
 String result3 = StringReverser.reverse(case3);

 //verify if the tests pass or fail
 if(result1.equals(expected1)) out.println("pass"); else out.println("fail");
 if(result2.equals(expected2)) out.println("pass"); else out.println("fail");
 if(result3.equals(expected3)) out.println("pass"); else out.println("fail");

 }
}
