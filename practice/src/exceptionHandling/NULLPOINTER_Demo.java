package exceptionHandling;

public class NULLPOINTER_Demo {

	public static void main(String[] args) {
		int a=new Integer(9);
		int b =new Integer(null);
		try {
			System.out.println(a+b);
		} catch (Exception e) {
		System.out.println(e);
		}
		
		String s1=null;
		String s2="10";
		try {
		System.out.println(s1.concat(s2));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
