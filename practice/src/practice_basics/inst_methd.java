package practice_basics;

public class inst_methd {
	int age=23;
	 String name="rajesh";
	static double sal=25000;
	public  void show()
	{
		System.out.println("name::"+name);
		System.out.println("age::"+age);
		System.out.println("salary::"+sal);
		
	}

	public static void main(String[] args) {
		 inst_methd d=new inst_methd ();
				 d.show(); //->>> ("Anonymous obj and method call")
	inst_methd obj=new inst_methd();
	obj.show();
		System.out.println("adress of d:::"+d.hashCode());
		System.out.println("adress of obj:::"+obj.hashCode());

	}

}
