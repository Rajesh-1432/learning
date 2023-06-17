package practice_basics;

interface i1{
	public void m1();
	public void m2();
	public void m3();
 static void show1(){
		System.out.println("show1 method::");
	}
 default void display(){
	 System.out.println("default method::");
	 
 }
	}
interface i2 extends i1{
	
	
}

public class interface_demo implements i2 {
	public void m1() {
		
		System.out.println("m1 method::");
	}
	public void m2() {
		System.out.println("m2 method::");
	}
	public void m3() {
		System.out.println("m3 method::");
	}
	

	public static void main(String[] args) {

		i2 ref=new interface_demo();
		ref.m1();
		ref.m2();
		ref.m3();
		i1.show1();
		ref.display();
	}

}
