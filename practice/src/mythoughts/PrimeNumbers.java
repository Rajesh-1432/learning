package mythoughts;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Prime Numbers 1 to 100::");
		for( int i=2;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.print(" "+i);
			}
			
		}
	}
}

	/*
				Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
			for(int i=1;i<=n;i++) {
				
				if(n%i==0) {
					count++;
				}
				
				}
			if(count==2) {
				System.out.println("you entered primeNumber");
			}
			else {
				System.out.println("NOT a primeNumber");
				
			}
	}
		
		*/
		



