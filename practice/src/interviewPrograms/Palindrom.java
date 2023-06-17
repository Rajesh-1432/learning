package interviewPrograms;
import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
 System.out.println("Enter a Number::");
 int n=sc.nextInt();
 int temp=n;
 int res=0;
 while(n>0) {
	 int r=n%10;
	 res=res*10+r;
	 n=n/10;
 }
 if(res==temp) {
	 System.out.println("You entered palindrom::"+res);
 }
 else {
	System.out.println("it is not a palindrom");
}
	}

}
