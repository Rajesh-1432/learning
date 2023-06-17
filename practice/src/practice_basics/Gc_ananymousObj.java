package practice_basics;

public class Gc_ananymousObj {
	String msg;
	 Gc_ananymousObj(String msg){
		this.msg=msg;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize::"+this.msg);
	}

	public static void main(String[] args) {
		new  Gc_ananymousObj("t1");//anonymous obj
		new Gc_ananymousObj("t2");//anonymous obj
		
		Runtime rt=Runtime.getRuntime();
         rt.gc();
	}

}
