package multiThreading;
class child2 extends Thread{
	int tot=0;
	public void run() {
		synchronized (this) {
			System.out.println();
			for (int i=0;i<10;i++) {
				tot=tot+i;
				
			}
			this.notify();
		}
		
	}
}
public class InterThraedCommunication_wait_notify {

	public static void main(String[] args) throws InterruptedException {
		child2 t=new child2();
		t.start();
	synchronized (t) {
		System.out.println("Main thread is waiting for child thread notificatiion::::::::::::");
              t.wait();		
              System.out.println("notifications::"+t.tot);
	}
		

	}

}
