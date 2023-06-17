package collectionsprograms;
import java.util.*;
public class List_demo1 {

	public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add(100);
	l.add(110);
	l.add(new Integer(20));
	l.add(null);
	l.add(null);
	String str1="Rajesh";
	byte [] b1=str1.getBytes();
	for(int i=0;i<b1.length;i++){
		l.add(b1[i]);
		
	}
	System.out.println(l);
	
for(Object o:l) {
	System.out.println(o);
}
}
}
