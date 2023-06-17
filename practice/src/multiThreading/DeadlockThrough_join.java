package multiThreading;
class child extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (Exception e) {
			
		}
		for(int i=0;i<10;i++) {
			System.out.println("child thread::"+i);
		}
	}
}

public class DeadlockThrough_join {
public static void main(String args[]) throws InterruptedException {
	child.mt=Thread.currentThread();
	child t=new child();
	t.start();
	t.join();
	for(int i=0;i<10;i++) {
		System.out.println("Main thread::"+i);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
	}
}
}
