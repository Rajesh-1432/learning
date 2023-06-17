package exceptionHandling;
import java.io.*;
class App1{
	static int age=22;
	static String name="Rajesh";
	static double sal=100000;
	static {
		System.out.println("age::"+age+"::name::"+name+"::salary::"+sal);
	}
	
}
public class IOException_Demo  {

	public static void main(String[] args) throws ClassNotFoundException {
		//handle by using throws keyword
		
		//FileInputStream fis1 =new FileInputStream("F:\\raj\\c1.txt");
		//to handle using try.............catch block
		/*try{
			FileInputStream fis =new FileInputStream("F:\\raj\\c.txt");
		}
catch (Exception e) {
	
}*/
		//clasnotfound
		Class.forName("exceptionHandling.App1");
	}

}
