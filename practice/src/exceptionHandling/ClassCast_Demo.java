package exceptionHandling;
class one{
	public void show() {
		System.out.println("Show");
	}
}
class two extends one{
	public void show2() {
		System.out.println("Show2");
	}
}
public class ClassCast_Demo {
public static void main(String args[]) {
	two t;
	one o=new one();
	t=(two)o;
	o.show();
	t.show2();
}
}
