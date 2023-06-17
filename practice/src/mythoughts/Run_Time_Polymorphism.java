package mythoughts;

class aknu{
	int MCA() {
	return 25;
	}
}
class msn extends aknu{
	int MCA() {
		return 65;
	}
}
class tpg extends aknu{
	int MCA() {
		return 40;
	}
}
public class Run_Time_Polymorphism {

	public static void main(String[] args) {
       aknu a=new aknu();
       System.out.println("Strength of rjy:"+a.MCA());
	    a=new msn();
		System.out.println("Strength of msn:"+a.MCA());
		a=new tpg();
		System.out.println("Strength of :"+a.MCA());
		
	
	}

}
