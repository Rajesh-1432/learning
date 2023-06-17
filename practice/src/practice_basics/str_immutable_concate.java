package practice_basics;

public class str_immutable_concate {
	public static void main(String[] args) {
	String str1=new String("Rajesh");
	String str2=str1.concat(" welcome");
    String str3=str2.concat("  to hyd");
    System.out.println(str3);
}
}
