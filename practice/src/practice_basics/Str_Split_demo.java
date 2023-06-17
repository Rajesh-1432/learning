package practice_basics;

public class Str_Split_demo {

	public static void main(String[] args) {
     String str1="Welcome/hai/raj/";
     String str2="hyd/have a nyc day/";
     String str3="bye";
     String str4=str1.concat(str2).concat(str3);
     for(int i=0;i<str4.length();i++) {
    	 try {
    		 String []str5=str4.split("/");
    		 System.out.println(str5[i]);
			
		} catch (Exception e) {
			
		}
     }

	}

}
