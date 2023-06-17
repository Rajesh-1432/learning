package mythoughts;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		System.out.println("Armstrong Numbers between 1 and 1000");
		for(int i=1;i<=1000;i++) {
			int temp=i;
			int sum=0;
			while(temp>0) {
				int m=temp%10;
				sum=sum+(m*m*m);
				temp=temp/10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	}

	}
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number::");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	while(temp>0) {
		int m=n%10;
		sum=sum+(m*m*m);
		temp=temp/10;
	}
	if(sum==n) {
		System.out.println("given number is Armstrong....");
	}
	else {
		System.out.println("given number is NOT a Armstrong.....");
	}
	}
}*/
	
