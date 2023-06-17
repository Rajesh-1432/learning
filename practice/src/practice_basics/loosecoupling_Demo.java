package practice_basics;
interface ione{
	void tech();
}
class java_tech implements ione{
	public void tech() {
		System.out.println("this is java technology:::");
		
	}
	
}
class python_tech implements ione{
	public void tech() {
		System.out.println("this is python  technology:::");
		
	}
	
}

public class loosecoupling_Demo {

	public static void main(String[] args) {
		ione ref=new java_tech();
		ref.tech();
		ref=new python_tech();
				ref.tech();

	}

}
