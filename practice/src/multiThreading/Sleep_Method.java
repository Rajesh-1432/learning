package multiThreading;
class MyThread3 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} 
			catch (Exception e) {
				
			}
		}
		
		
	}
	
}
public class Sleep_Method {

	public static void main(String[] args) {
		 MyThread3 obj=new  MyThread3();
		 Thread t=new Thread(obj);
		 MyThread3 obj1=new  MyThread3();
		 Thread t1=new Thread(obj1);
		 t.start();
		 t1.start();

	}

}
