package collectionsprograms;
import java.util.*;

class Student1{
	int sid;
	String sname;
	int sage;
	public Student1(int sid,String sname,int sage) {
	this.sid=sid;
	this.sage=sage;
	this.sname=sname;
	}
}
class Emp2{
	int eid;
	String ename;
	double esal;
	public Emp2(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	
	}
}
class product{
	int pid;
	String pname;
	double price;
	public product(int pid,String pname,double price) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	
	}
}
public class List_Generic_demo2 {

	public static void main(String[] args) {
		List <Object>l=new ArrayList();
		l.add(new Emp2(102,"Rajesh",25000));
		l.add(new Student1(12,"kannaaa", 23));
		l.add(new product(123,"watch",3210.02));
		l.add(new product(124,"smartwatch",5210.02));
for(Object o:l) {
	if(o instanceof Emp2) {
		Emp2 e1=(Emp2)o;
		System.out.println(e1.eid+"::"+e1.ename+"::"+e1.esal);
	}
	if(o instanceof Student1) {
		Student1 s1=(Student1)o;
		System.out.println(s1.sid+"::"+s1.sname+"::"+s1.sage);
	}
	if(o instanceof product) {
		product p1=(product)o;
		System.out.println(p1.pid+"::"+p1.pname+"::"+p1.price);
	}
}
	}

}
