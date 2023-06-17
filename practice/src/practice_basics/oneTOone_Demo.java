package practice_basics; 
class Adress{
	String state;
	String city;
	String country;
	Adress(String city,String state,String country){
		this.state=state;
		this.city=city;
		this.country=country;
	}
}
class Employee{
	int eid;
	String ename;
	Adress adress;
	Employee(int eid,String ename,Adress adress){
		this.eid=eid;
		this.ename=ename;
		this.adress=adress;
	}
	public void show() {
		System.out.println("ename::"+ename+"\n eid::"+eid+"\n city::"+adress.city+"\n state::"+adress.state+"\n country::"+adress.country);
	}
}

public class oneTOone_Demo {

	public static void main(String[] args) {
	Adress add1=new Adress("palasa", "AP", "ind");
	Adress add2=new Adress("hyd", "TS", "ind");
    Employee e1=new Employee(101, "raj", add1);
    Employee e2=new Employee(102, "kanna", add2);
    e1.show();
    e2.show();
    
	}

}
