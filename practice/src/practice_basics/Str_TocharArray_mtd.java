package practice_basics;
import java.util.*;
public class Str_TocharArray_mtd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string::");
		String str1=sc.next();
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
