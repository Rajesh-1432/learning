package exceptionHandling;

public class Exception_Methods {

	public static void main(String[] args) {
		System.out.println("Run");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
		//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());//to get only message (Reason for the exception)
		}

	}

}
