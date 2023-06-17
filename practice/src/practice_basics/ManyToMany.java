package practice_basics;
import java.util.*;

class Sal1{
	double esal;
	List<Employ>Sal;
	Sal1(double esal,List<Employ>sal){
		this.esal=esal;
		this.Sal=sal;
	}
	public void show1() {
		Sal.forEach(x->{
			Employ e=(Employ)x;
			System.out.println(e.eid+":::"+e.ename+":::"+esal);
		});
	}
}
class Adresss{
	String city;
	String state;
	String country;
	List<Employ>addr;
	Adresss(String city,String state,String country,List<Employ>addr){
		this.city=city;
		this.state=state;
		this.country=country;
		this.addr=addr;
		
	}
	public void show2() {
		addr.forEach(x->{
			Employ e2=(Employ)x;
			System.out.println(e2.eid+":::"+e2.ename);
			System.out.println(city+":::"+state+":::"+country);
		
		});
	}	
}
class Employ{
	int eid;
	String ename;
	List<Adresss>addr;
	List<Sal1>s;
	public Employ(int eid,String ename,List<Adresss>addr,List<Sal1>s) {
		this.eid=eid;
		this.ename=ename;
		this.addr=addr;
		this.s=s;
	}
	public void show3() {
		System.out.println("enmae::"+ename+"\teid::"+eid);
		
		addr.forEach(x->{
			Adresss ad=(Adresss)x;
			System.out.println(""+ad.city+"::"+ad.state+"::"+ad.country);
		});
		s.forEach(x->{
			Sal1 s1=(Sal1)x;
			System.out.println("esal::"+s1.esal);
		});
	
		}
}
public class ManyToMany {

	public static void main(String[] args) {
		List<Adresss>ad1=new ArrayList();
		ad1.add(new Adresss("palasa", "AP", "IND",null));
		List<Sal1>s2=new ArrayList();
		s2.add(new Sal1(21000, null));
		Employ l1=new Employ(140,"rajeshuuuuuu", ad1, s2);
		l1.show3();
		
	}

}
