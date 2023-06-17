package practice_basics;

public class Enc_demo {
	int age;
	String name;
	double sal;
	public void setage(int age) {
		this.age=age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setsal(double sal) {
		this.sal=sal;
	}
	public int getage() {
		return this.age;
	}
	public String getname() {
		return this.name;
	}
	public double getsal() {
		return this.sal;
	}
	public static void main(String[] args) {
	Enc_demo obj=new Enc_demo();
	obj.setname("rajesh");
	obj.setage(22);
	obj.setsal(22000);
	
	System.out.println("Name::"+obj.getname());
	System.out.println("Age::"+obj.getage());
	System.out.println("Salary::"+obj.getsal());

	}

}
