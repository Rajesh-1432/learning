package practice_basics;
import java.util.*;
//to load predifined classes
public class Cload3_demo {

	public static void main(String[] args) {
		try {
			Class c1=Class.forName("java.util.ArrayList");
			System.out.println(c1.getPackage());
			System.out.println(c1.getName());
			//System.out.println(c1.getPackageName());
			
			ArrayList arl=(ArrayList)c1.newInstance();
			arl.add("hello");
			arl.add("rajesh");
			arl.add(1432);
			arl.add(10.00012);
			System.out.println(arl);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
