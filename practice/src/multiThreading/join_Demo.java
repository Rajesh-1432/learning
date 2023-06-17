package multiThreading;
class Mythread5 extends Thread{
	static Thread mt;
	public void run() {
		for(int i=0;i<5;i++) {
			
			try {
				mt.join();
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("MyThread5::"+i);
		}
	}
	
}
public class join_Demo {

	public static void main(String[] args) throws InterruptedException {
		Mythread5 .mt=Thread.currentThread();
		Mythread5 t=new Mythread5();
		t.start();
		//in this way main thread(class) is waiting for Mythread5
		//t.join();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			
			}
		}
		

	}

}
