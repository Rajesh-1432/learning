package practice_basics;

public class Break_demo {

	public static void main(String[] args) {
		
		int i,j;
		outer:
		for(i=0;i<5;i++)
		{
		for(j=0;j<6;j++)
		{
		System.out.println(i + " " + j);
		if(j==3)
		break outer;
		}
		}
	}
}
	


