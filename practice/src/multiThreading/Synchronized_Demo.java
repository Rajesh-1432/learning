package multiThreading;
class Display{
	public synchronized void wish(String name) {
		for(int i=1;i<10;i++) {
			System.out.println(" hello"+i);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		System.out.print(name);
		}
	}
}
class Mythread6 extends Thread{
	String name;
	Display d;
	public Mythread6(Display d,String name) {
		this.d=d;
		this.name=name;
		
		
	}
	public void run() {
		d.wish(name);
	}
}
public class Synchronized_Demo {

	public static void main(String[] args) {
		Display d=new Display();
		Mythread6 t=new Mythread6(d, "rajesh");
		Mythread6 t1=new Mythread6(d, "Rajeshuuuuu");
		t1.start();
		t.start();
	}

}
