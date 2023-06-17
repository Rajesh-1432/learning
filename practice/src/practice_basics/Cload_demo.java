package practice_basics;
class ClsOne{
	static int id=1001;
	static String name="Rajeshuuuuu";
	static double sal=25000;
	static {
		System.out.println("Name::"+name);
		System.out.println("Id::"+id);
		System.out.println("Salary::"+sal);
	}
}

public class Cload_demo {

	public static void main(String[] args) {
		try {
			Class.forName("practice_basics.ClsOne");
		} catch (Exception e) {
			
		}

	}

}
