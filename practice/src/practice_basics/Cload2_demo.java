package practice_basics;
class Emp{
	static int id=1001;
	static String name="Rajeshuuuuu";
	static double sal=25000;
public void show() {
	System.out.println("Name::"+name);
	System.out.println("Id::"+id);
	System.out.println("Salary::"+sal);
}
	
}

public class Cload2_demo {

	public static void main(String[] args) {
	
try {
	Class c1=Class.forName("practice_basics.Emp");
	Emp e1=(Emp)c1.newInstance();
	e1.show();
	
} catch (Exception e) {
	
}

	}

}
