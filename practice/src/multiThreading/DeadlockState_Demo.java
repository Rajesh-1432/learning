package multiThreading;
class A{
	public synchronized void d1(B b) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		b.last();
	}
	public synchronized void  last() {
		System.out.println("this is A's");
	}
}
class B{
	public synchronized void d2(A a) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		a.last();
	}
	public synchronized void last() {
		System.out.println("this is B's");
	}
}
public class DeadlockState_Demo extends Thread{
	A obj1=new A();
	B obj2=new B();
	public void m1() {
		this.start();
		obj2.d2(obj1);
	}
	public void run() {
		obj1.d1(obj2);
	}

	public static void main(String[] args) {
		DeadlockState_Demo t=new DeadlockState_Demo();
		t.m1();
	}

}
