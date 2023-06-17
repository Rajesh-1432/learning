package practice_basics;

public class thisref_demo {
	thisref_demo(int age, String name,double sal){
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("salary="+sal);
	}
	
	thisref_demo(){
	this(25,"kanna",21000);
	}
	thisref_demo(int x){
		this(x,"papa",23000);
	}
	thisref_demo(String n,double z){
		this(32,n,z);
	}
		
	public static void main(String[] args) {
		new thisref_demo();
		new thisref_demo("bujji",32000);
		new thisref_demo(24);
		
	}

}
