package mythoughts;
import java.util.*;
class one1{
	public one1(int a,int b) {
		System.out.println(a+b);
	}
	
	
}
	
public class Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x::");
		int x=sc.nextInt();
		System.out.println("Enter value of y::");
		int y=sc.nextInt();

		//one1 a=new one1();
		one1 n=new one1(x, y);

	}

}
