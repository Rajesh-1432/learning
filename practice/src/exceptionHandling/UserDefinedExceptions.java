package exceptionHandling;

import java.util.Scanner;

class TooYoung extends RuntimeException{
	public TooYoung(String s1) {
		super(s1);
	}
}
class TooOld extends RuntimeException{
	public TooOld( String s1) {
		super(s1);
	}
}
public class UserDefinedExceptions {

	public static void main(String[] args) {
		System.out.println("Enter age:");
		int age =new Scanner(System.in).nextInt();
		if(age<20) {
			throw new TooYoung("Rajesh");
		}
		else if(age<60) {
			throw new  TooOld("Adult");
		}
		else {
			System.out.println("Senior citizen");
		}

	}

}
