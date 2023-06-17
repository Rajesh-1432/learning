package collectionsprograms;
import java.util.*;

public class Map_HashMap_demo1 {

	public static void main(String[] args) {
		Map m=new HashMap<>();
		m.put("Rajesh",new Integer(1432));
		m.put("Rajesh",new Integer(1432));
		m.put("Raj",new Integer(1432));
		m.put("Rajesh",new Integer(221));
		m.put("Satya",new Integer(12));
		m.put("NoorJahan",new Integer(235));
		m.put("Noor",new Integer(235));
		m.putIfAbsent("Navya",132 );
System.out.println(m);

System.out.println("KEYSET:::::");
Set s=m.keySet();
s.forEach(x->{
	System.out.println(x);
});
System.out.println("VALUES::");
Collection c=m.values();
c.forEach(x->{
	System.out.println(x);
});
System.out.println("fetching for both:::");
Set s1=m.entrySet();
/*s1.forEach(x->{
	System.out.println(x);
});*/
Iterator it=s1.iterator();
while(it.hasNext()) {
	Map.Entry me=(Map.Entry)it.next();
System.out.println(me.getKey()+":::"+me.getValue());
}
	}

}
