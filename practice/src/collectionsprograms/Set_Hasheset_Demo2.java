package collectionsprograms;
import java.util.*;
public class Set_Hasheset_Demo2 {

	public static void main(String[] args) {
		Set s =new HashSet<>();
		List l=new ArrayList<>();
	//Set s=new HashSet<>(l);
	s.add("raj");
	s.add(10);
	s.add(10);
	s.add(20);
	s.add(null);
	s.add(null);
	s.add(new Double(190001));
	
	l.add(20);
	l.add(20);
	l.add(20);
	l.add(50);
	l.add(30);
	l.add(60);
	
	}

}
