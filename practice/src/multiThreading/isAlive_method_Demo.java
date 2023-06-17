package multiThreading;

class Mythread4 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread is running::"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
public class isAlive_method_Demo {

	public static void main(String[] args) {
		Mythread4 t=new Mythread4();
	boolean b1=	t.isAlive();
	System.out.println(b1);
		t.start();
		b1=t.isAlive();
		System.out.println("started::"+b1);
	}

}
