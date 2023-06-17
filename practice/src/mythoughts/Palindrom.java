package mythoughts;
import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number::");
	int n=sc.nextInt();
	int temp=n;
	int pal=0;
	while(n>0) {
	int	r=n%10;
		pal=(pal*10)+r;
		n=n/10;
	}
	if(temp==pal) {
		System.out.println("given number is palindrom");
	}
	else {
		System.out.println("not a palindrom");
	}

	}

}
