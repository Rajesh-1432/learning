package interviewPrograms;



public class Armstrong {

	public static void main(String[] args) {
	/*	for(int i=1;i<=1000;i++) {
			int temp=i;
			int sum=0;
			while(temp>0) {
				int r=temp%10;
				sum=sum+(r*r*r);
				temp=temp/10;
			}
			
			
		if(i==sum) {
			System.out.println(i);
		}
		
		}*/
		int n=353;
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(sum==temp) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}

	}

}
