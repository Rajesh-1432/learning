package mythoughts;
import java.util.*;
public class Display_duplicateElement_Array {

	public static void main(String[] args) {
		Set s=new HashSet<>();
		List l=new ArrayList<>();
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.add(2);
		 l.add(2);
		 l.add(3);
		 l.add(4);
		 l.add(4);
		 //for dlt duplicate values
		 s.add(1);
		 s.add(1);
		 s.add(2);
		 s.add(2);
		 s.add(2);
		 s.add(3);
		 s.add(4);
		 s.add(4);
		 System.out.println("without duplicate obj");
		 s.forEach(x->{
			 System.out.println(x);
		 });
		 System.out.println("with duplicate obj");
		 l.forEach(x->{
			 System.out.println(x);
		 });
		
		}
		
	
	}

