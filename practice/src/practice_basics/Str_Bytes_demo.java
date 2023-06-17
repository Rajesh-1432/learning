package practice_basics;

public class Str_Bytes_demo {

	public static void main(String[] args) {
	String str1=new String("Welcome");
	String str2=new String("raj");
	String str3=new String("bye");
	String str4=str1.concat(str2).concat(str3);
	byte[]b1=str4.getBytes();
	for(int i=0;i<str4.length();i++) {
		char ch1=str4.charAt(i);
		System.out.println(ch1+":::"+b1[i]);
		
	}

	}

}
