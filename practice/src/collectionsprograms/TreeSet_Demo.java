package collectionsprograms;
import java.util.*;
public class TreeSet_Demo {

	public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(10);
	ts.add(100);
	ts.add(101);
	ts.add(5);
	ts.add(106);
	ts.add(20);
	System.out.println(ts);
	System.out.println();
	Iterator it=ts.descendingIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	

	}

}
