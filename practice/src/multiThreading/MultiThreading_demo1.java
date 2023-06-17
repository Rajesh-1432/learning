package multiThreading;
class MyThread1 extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
}


public class MultiThreading_demo1 {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();

	}

}
