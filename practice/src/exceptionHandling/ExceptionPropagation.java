package exceptionHandling;

public class ExceptionPropagation {
	//Exception is going to create in m1 method but m2 method is going to handle exception
	public static void m1() {
		System.out.println("Hai");
		System.out.println(10/0);
		System.out.println("This is rajesh");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Bye");
		try {
			m2();
		} catch (Exception e) {
			
		}
	}
	public static void m2() {
		System.out.println("M2 method");
		System.out.println(10/0);
	}
	public static void m3() {
		try {
			m1();
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		ExceptionPropagation.m3();
	
	}

}
