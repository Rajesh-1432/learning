package exceptionHandling;

public class TRY_CATCH_Demo {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hai");

	}

}
