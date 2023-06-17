package practice_basics;
class sapp1{
	
	sapp1(int number,String name,double sal){
		System.out.println("number::"+number+"\nname::"+name+"\nsalary::"+sal);
	}
}

public class super_constructor extends sapp1 {
	super_constructor(){
		super(45,"rohit",12000000);
	}

	public static void main(String[] args) {
		
new super_constructor();
	}

}
