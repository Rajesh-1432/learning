package practice_basics;
/* class Adress2 {
	String city;
	String state;
	String country;
	Adress2(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
}*/
class Sal{
	double sal;
	Sal(double sal){
		this.sal=sal;
	}
}
class Emply2{
	String ename;
	int eid;
	Sal sal;
	Adress adr;
	Emply2(String ename,int eid,Sal sal,Adress adr){
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
		this.adr=adr;
	}
	public void show() {
		System.out.println("ename::"+ename+"\n eid::"+eid+"\n salary::"+sal.sal+"\n city::"+adr.city+"\n state::"+adr.state+"\n country::"+adr.country);
	}
}

public class oneTOmany {

	public static void main(String[] args) {
Adress a3=new Adress("palasa", "AP","IND");
Adress a4=new Adress("palasa", "AP","IND");
Sal s1=new Sal(25000);
Sal s2=new Sal(20000);
Emply2 e3=new Emply2("Raj", 102, s1, a3);
Emply2 e4=new Emply2("kanna", 103, s2, a4);
e3.show();
e4.show();


	}

}
