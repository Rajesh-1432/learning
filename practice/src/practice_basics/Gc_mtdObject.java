package practice_basics;

public class Gc_mtdObject {
	String msg;
	Gc_mtdObject(String msg){
		this.msg=msg;
	}
	public static void m1() {
		Gc_mtdObject t1=new Gc_mtdObject("t1");
		Gc_mtdObject t2=new Gc_mtdObject("t2");
	}
	public static void m2() {
		m1();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize::"+this.msg);
	}

	public static void main(String[] args) {
		
		m2();
		Runtime rt=Runtime.getRuntime();
        rt.gc();
        
	}

}

	
