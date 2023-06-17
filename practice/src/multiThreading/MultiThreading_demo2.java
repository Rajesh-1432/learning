package multiThreading;
class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("thread gets started...................");
		
	}
	
}
public class MultiThreading_demo2 {

	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		Thread t1= new Thread(t);
		t1.start();
		
		
	}

}
