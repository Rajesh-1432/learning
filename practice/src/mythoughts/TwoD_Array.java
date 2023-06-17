package mythoughts;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		int b[][]=new int[3][5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("Enter an element at b["+i+"]["+j+"]::");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("  "+b[i][j]);
			
			}
			System.out.println();
		}
		
	}

}
