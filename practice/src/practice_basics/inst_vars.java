package practice_basics;

public class inst_vars {
int A=10;
String name="Rajesh";
double D=12.00;
	
	
	public static void main(String[] args) {
	inst_vars obj=new inst_vars();
		
		System.out.println("name="+obj.name+"\nage="+obj.A+"\nsalary="+obj.D);
		System.out.println("obj Adress="+obj.hashCode());

	}

}
