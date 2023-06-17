package practice_basics;
import java.util.*;
public class Str_ContentEquals_mtd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String str1=sc.next();
    StringBuffer b1=new StringBuffer("rajesh");
    if(str1.contentEquals(b1)) {
    	System.out.println("valid");
    }
    else {
    	System.out.println("not valid");
    }

	}

}
