package collectionsprograms;
import java.util.*;
public class Map_HashMap_demo2 {
	public static void main(String args[])
	{
	Map m=new HashMap<>();
	m.put("Rajesh",new Integer(1432));
	m.put("Raj",new Integer(1432));
	m.put("Rajesh",new Integer(221));
	m.put("Satya",new Integer(12));

	Map m1=new HashMap<>();
	m1.put("NoorJahan",new Integer(235));
	m1.put("Noor",new Integer(235));
	m.putAll(m1);
	Set s1=m.entrySet();
	s1.forEach(x->{
		System.out.println(x);
	});
}
}