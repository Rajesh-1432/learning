package practice_basics;

public class Str_CharAt2_Demo {
 public static void main (String args[]) {
	 String str1="WELCOME";
	 StringBuffer sb1=new StringBuffer("rajeshuuuu");
	 StringBuilder sd1=new StringBuilder("hav a nyc day");
	 String str2=str1.concat(sb1.toString()).concat(sd1.toString());
	 for(int i=0;i<str2.length();i++) {
		 char ch1=str2.charAt(i);
		 int n1=str2.codePointAt(i);//to get ascii values
		 System.out.println(ch1+"::ASCII code"+n1);
	 }
	 
 }
}
