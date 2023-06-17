package practice_basics;
 
class sapp{
	int age=22;
	String name="raj";
	double sal=20000;
	
}

public class super_Demo extends sapp {
	int age=21;
	String name="kanna";
	double sal=22000;
	super_Demo(){
	System.out.println("\nage::"+super.age+"\nname::"+super.name+"\nsalary::"+super.sal);
	}

	public static void main(String[] args) {
	/*super_Demo obj=new super_Demo();
	obj.super_Demo();*/
		new super_Demo();

	}

}
