package mythoughts;
class Mythread1 implements Runnable {
	public void run() {
		System.out.println("thread is running");
		
	}
	
	
}
public class Thread_Demo1 {

	public static void main(String[] args) {
		Mythread1 t=new Mythread1();
		Thread t1=new Thread(t);
		t1.start();

	}

}
