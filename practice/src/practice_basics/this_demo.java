package practice_basics;

public class this_demo {
	int age=25;
	String name="papa";
	double sal=32000;
	this_demo(int age,String name,double sal){
		this.age=age;
		this.name=name;
		this.sal=sal;
	}
	public void display() {
		System.out.println("name:::"+name);
		System.out.println("age:::"+age);
		System.out.println("salary:::"+sal);
	}
	

	public static void main(String[] args) {
		new this_demo(25,"kanna",32000).display();

	}

}
