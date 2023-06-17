package collectionsprograms;
import java.util.*;

public class Set_Hasheset_Demo {

	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add("raj");
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(null);
		s.add(null);
		s.add(new Double(190001));
		s.forEach(x->{
			System.out.println(x);
		});

	}

}
