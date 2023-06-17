package practice_basics;



public class Str_CharAt1_Demo {

	public static void main(String[] args) {
		String str1="welcome";
		String str2="kanna";
		String str3="Have a nice day::::";
		String str4=str1.concat(str2).concat(str3);
		for(int i=0;i<=str4.length();i++) {
			char ch=str4.charAt(i);
			int n1=(int)ch;
			System.out.println(ch+"::ASCII code"+n1);
		}

	}

}
