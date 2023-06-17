package exceptionHandling;

public class Try_Catch_Finally_Demo {

	public static void main(String[] args) {
		try {
			System.out.println(9);
			System.out.println("raj");
			System.out.println("esh");
			
		} catch (Exception e) {
			System.out.println(10/0);
			//sSystem.out.println("hello ee line bokka"+e);
		}
		finally {
			System.out.println("evadu emaipoina parledhu nenu vastaa no prob");
		}
		System.out.println("naku veellatho pani ledhu nenu vachesta 'try catch' unte");
		

	}

}
