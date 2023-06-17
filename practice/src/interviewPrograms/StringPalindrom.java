package interviewPrograms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::");
		String s1=sc.next();
		int length=s1.length();
		String Rev="";
       for(int j=length;j>=0;j--) {
    	    Rev= Rev+s1.charAt(j);
       }
       if(s1.equals(Rev)) {
    	   System.out.println("s1 is palindrom::"+Rev);
       }
       else {
		System.out.println("Not a palindrom");
	}
	}

}
