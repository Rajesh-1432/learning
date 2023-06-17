package practice_basics;

public class Gc_null {
 
	String msg;
	public Gc_null(String msg) {
		this.msg=msg;
	}
	protected void finalize() throws Throwable{
		System.out.println("Finalize::"+this.msg);
		
		
	}
	public static void main(String[] args) {
		Gc_null t1= new Gc_null("t1");
		Gc_null t2= new Gc_null("t2");
		t1=null;
		t2=null;
		Runtime rt=Runtime.getRuntime();
		rt.gc();
 		
		

	}

}
