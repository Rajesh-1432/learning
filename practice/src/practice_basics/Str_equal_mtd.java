package practice_basics;
import java.util.*;
public class Str_equal_mtd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string1:");
	String str1=sc.next();
	System.out.println("enter string2:");
	String str2=sc.next();
if(str1.equals(str2)) {
	System.out.println("those two strings are equal");
}
else {
	System.out.println("those two strings are not equal");
}
	}

}
