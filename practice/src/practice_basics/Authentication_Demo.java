package practice_basics;
import java.util.*;
public class Authentication_Demo {
	int eid;
	String ename;
	double esal;
	public void checkauth(String uname,String pwd) {
		if(uname.equals("rajesh")&&pwd.equals("rajesh1432")) {
			eid=1432;ename="kanna";esal=25000;
			System.out.println("ename::"+ename+"\neid::"+eid+"\nesal"+esal);
		}
		else {
			System.out.println("authentication failed");
		}
	
	
		
	}


	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		while(true) {

			System.out.println("\t\t\t\t LOGIN");
			System.out.println("1.View Details");
			System.out.println("2.Exit");
			System.out.println("Enter your choice:");
			int i=SC.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter user name:");
				String inuser =SC.next();
				System.out.println("Enter password");
				String inpwd=SC.next();
				new Authentication_Demo().checkauth(inuser,inpwd); 
				
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
		

	}

}
