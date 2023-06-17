package mythoughts;
import java.util.*;
public class ATM_Demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double avl_blnce=23000;
		String name="Rajesh";
		int pin=1234;
		System.out.println("Welcom to SBI ");
		System.out.println("Enter your pin::");
		int a1=sc.nextInt();
		if(pin==a1) {
			
		
		while(true){
			System.out.println("1.view details");
			System.out.println("2.withdraw");
			System.out.println("3.deposit");
			System.out.println("4.exit");
			System.out.println("Enter your choice::");
			int opt=sc.nextInt();
			switch (opt) {
			case 1:
				
				System.out.println("Hi "+name);
				System.out.println(" your Available Balence::"+avl_blnce);
				
				break;
			case 2:
				System.out.println("Enter amount::");
				double a2=sc.nextDouble();
				avl_blnce=avl_blnce-a2;
				System.out.println(" your Available Balence::"+avl_blnce);
				break;
			case 3:
				System.out.println("Enter amount::");
				double a3=sc.nextDouble();
				avl_blnce=avl_blnce+a3;
				System.out.println(" your Available Balence::"+avl_blnce);
				break;
			case 4:
				System.out.println("THANK YOU:");
				System.exit(0);
			default:
				System.out.println("Invalid choice::");
				break;
			}
		}
		
		}
		
			
		else {
			System.out.println("you entered wrong pin........!");
		
		}
		
	}
	

}
