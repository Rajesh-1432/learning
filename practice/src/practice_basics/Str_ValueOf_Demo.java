package practice_basics;

public class Str_ValueOf_Demo {

	public static void main(String[] args) {
	Integer i1=new Integer(14);
	Double d1=new Double(60000);
	Character ch1=new Character('R');
	int a=32;
	char ch2='A';
	double d2=30000;
	boolean b2=false;
	
	String str1=String.valueOf(i1);
	String str2=String.valueOf(d1);
	String str3=String.valueOf(ch1);
	String str4=String.valueOf(a);
	String str5=String.valueOf(ch2);
	String str6=String.valueOf(d2);
	String str7=String.valueOf(b2);
	String str8=str1.concat(str4).concat(str3).concat(str5).concat(str2).concat(str6).concat(str7);
    System.out.println(str8);
	}

}
