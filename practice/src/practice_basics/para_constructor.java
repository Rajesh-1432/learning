package practice_basics;

public class para_constructor {
	
	int page;
	String pname;
	double psal;
	para_constructor(int age,String name,double sal)
	{
		page=age;
		pname=name;
		psal=sal;
		System.out.println("name:::"+pname+"\n age:::"+page+"\n salary:::"+psal);
		
	}

	public static void main(String[] args) {
		new para_constructor(23,"KANNA",32000);
		

	}

}
