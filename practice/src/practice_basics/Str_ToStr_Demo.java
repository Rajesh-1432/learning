package practice_basics;

public class Str_ToStr_Demo {

	public static void main(String[] args) {
		Integer l1=new Integer(14);
		Character ch1=new Character('R');
		Double d1=new Double(25000);
		Boolean b1=new Boolean(true);
		String str1=l1.toString();
		String str2=ch1.toString();
		String str3=d1.toString();
		String str4=b1.toString();
		String str5=str1.concat(str2).concat(str3).concat(str4);
		System.out.println(str5);

	}

}
