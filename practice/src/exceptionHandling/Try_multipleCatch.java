package exceptionHandling;

public class Try_multipleCatch {

	public static void main(String[] args)  {
		int a[]= {10,20};
		String s1=null;
		String s2="hello";
		
		System.out.println(" model");
	try {
				System.out.println(a[5]);
				System.out.println(8987/0);
				System.out.println(s1.concat(s2));
		}
			
		
		catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("catch2::"+ai);
		}
		
		
		 catch (ArithmeticException ae) {
			System.out.println("catch1::"+ae);
		}
		
		catch (NullPointerException ne) {
			System.out.println("catch3::"+ne);
		}
	catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}

	}

}

