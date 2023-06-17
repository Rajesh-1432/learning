package practice_basics;

public class thisref_methd {
	int x;
	public void show1(int x) {
		this.x=x;
	}
	public void show2(int x) {
		this.x=x;
		
	}
	

	public static void main(String[] args) {
		thisref_methd obj1=new thisref_methd();
		obj1.show1(14);
		//obj1.show2(32);
		thisref_methd obj2=new thisref_methd();
		obj2.show1(1432);
		System.out.println("obj1 show1:::"+obj1.x);
		System.out.println("obj2 show1:::"+obj2.x);

	}

}
