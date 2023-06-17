package multiThreading;
class child1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread::"+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		
	}
}
public class Deadlock_Stop_method {
public static void main(String args[]) {
	child1 t=new child1();
	t.start();
	t.stop();
}
}
