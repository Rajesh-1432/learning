package practice_basics;

public class Gc_refobj {
	String msg;
	Gc_refobj(String msg){
		this.msg=msg;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize::"+this.msg);
	}

	public static void main(String[] args) {
		Gc_refobj t1=new Gc_refobj("t1");
		Gc_refobj t2=new Gc_refobj("t2");
		t1=t2;
		Runtime rt=Runtime.getRuntime();
         rt.gc();
	}

}
