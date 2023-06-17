package exceptionHandling;

public class Finally_Demo {
 public static void main(String args[]) {
	 System.out.println("ANNAAAA eyyyyyy...................");
	 try {
		 System.out.println(10/0);
		
	} 
	 catch (Exception e) {
		System.out.println(e);
	}
	 finally {
		System.out.println("finally block");
		
	}
 }
}
