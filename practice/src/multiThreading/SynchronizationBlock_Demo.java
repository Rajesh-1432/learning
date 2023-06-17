package multiThreading;
class Display2 {
	
	public  synchronized void displayAscii() {
		for(int i=65;i<99;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
					
			}
		}
	}
	public synchronized  void displayChar() {
		for(int i=65;i<99;i++) {
			char ch=(char)i;
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
					
			}
		}
	}
	}
class Mythread7 extends Thread{
	Display2 display;
	public Mythread7(Display2 display) {
		this.display=display;
	
	}
	public void run() {
		//synchronized (display) 
		{
			display.displayAscii();
		}
		
	}
	
}
class Mythread8 extends Thread{
	Display2 display;
	public Mythread8(Display2 display) {
		this.display=display;
	
	}
	public void run() {
		//synchronized (display) 
		{
			display.displayChar();
		}
	
	}
	
}

public class SynchronizationBlock_Demo {

	public static void main(String[] args) {
		Display2 d=new Display2(); 
		Mythread7 t1=new Mythread7(d);
		Mythread8 t2=new Mythread8(d);
		t2.start();
		t1.start();

	}

}
