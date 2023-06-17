package practice_basics;

public class Str_typecstig_Demo {

	public static void main(String[] args) {
     String str1=new String();
     String str2= new String("Welcome");
     System.out.println("");
     char []ch= {'A','P','P','L','E'};
     String str3=new String(ch);
     System.out.println("char to string::"+str3);
     String str4=new String(ch,0,4);
     System.out.println("char to string with in range::"+str4);
     int[]a= {65,66,67,68,69};
     String str5=new String(a,0,4);
     System.out.println("int to string with in range::"+str5);
     byte[]b1= {95,96,97,98,99,100};
     String str6=new String(b1,0,4);
     System.out.println("byte to string with in range::"+str6);
     StringBuffer sb1=new StringBuffer("raj");
     String str7=new String(sb1);
     System.out.println("StringBuffer to string::"+str7);
     StringBuilder sd1=new StringBuilder("bye");
     String str8=new String(sd1);
     System.out.println("StringBuilder to string::"+str8);
}
}
