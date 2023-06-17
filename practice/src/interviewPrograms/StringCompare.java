package interviewPrograms;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter user Name::");
    String s1=sc.nextLine();
    System.out.println("Enter Password::");
    String s2=sc.nextLine();
    if(s1.equals("Rajesh")&& s2.equals("pwd@1")) {
    	System.out.println("login succsesfully");
    	
    }
    else {
		System.out.println("Invalid details");
	}
	}

}
