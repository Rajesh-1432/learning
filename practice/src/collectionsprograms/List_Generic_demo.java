package collectionsprograms;
import java.util.*;

class Emp1{
	int eid;
	String ename;
	double esal;
	public Emp1(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
}
public class List_Generic_demo {

	public static void main(String[] args) {
		
List <Emp1> l=new ArrayList();
l.add(new Emp1(101, "rajeshuuu", 25000));
l.add(new Emp1(102, "bujjiiiii", 55000));
l.add(new Emp1(101, "papaaaaa", 28000));
//for loop
/*for(Emp1 o:l) {
	System.out.println(o.ename+"::"+o.eid+"::"+o.esal);
	
}*/
//for each

/* l.forEach(x->{
	Emp1 o=(Emp1)x;
	System.out.println(o.ename+"::"+o.eid+"::"+o.esal);
});*/

//iterator
/* Iterator it=l.iterator();
while(it.hasNext()) {
	Emp1 o=(Emp1)it.next();
	System.out.println(o.ename+"::"+o.eid+"::"+o.esal);
}*/

//forEachRemaining
Iterator it=l.iterator();
it.forEachRemaining(x->{
	Emp1 o=(Emp1)x;
	System.out.println(o.ename+"::"+o.eid+"::"+o.esal);
});

	}

}
