package exceptionHandling;

public class NumberFormateException_Demo {
	public static void main(String args[]) {
		String s1="Hello";
		String s2="Hai";
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		try {
			
			System.out.println("add::"+(n1+n2));}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
