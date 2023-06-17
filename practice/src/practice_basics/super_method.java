package practice_basics;
class sapp2{
	public void show(int a, String name,double sal) {
		System.out.println("show");
		System.out.println("name::"+name+"\nnumber::"+a+"\nsalary::"+sal);
	}
}
public class super_method extends sapp2 {
	public void show1(int number, String n,double s) {
		System.out.println("number::"+number+"\nname::"+n+"\nsalary::"+s);
	}

	public static void main(String[] args) {
		new super_method().show(45, "Rohit",122222000);
		

	}

}
