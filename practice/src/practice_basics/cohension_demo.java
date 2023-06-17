package practice_basics;
class Name{
	String sname;
	String ename;
	String pname;
	public String getSname(String sname ){
		this.sname=sname;
		return this.sname;
		}
	public String getEname(String ename) {
		this.ename=ename;
		return this.ename;
	}
	public String getPname(String pname) {
		this.pname=pname;
		return this.pname;
		
	}
}
class Age{
	int eage;
	int sage;
	public int getEage(int eage) {
		this.eage=eage;
		return this.eage;
	}
	public int getSage(int sage) {
		this.sage=sage;
		return this.sage;
	}
}
	class Phno{
		
		int ephno;
		int sphno;
		public int getEphno(int ephno) {
			this.ephno=ephno;
			return this.ephno;
			}
		public int getSphno(int sphno) {
			this.sphno=sphno;
			return this.sphno;
		}
	}

public class cohension_demo {

	public static void main(String[] args) {
		Name n=new Name();
		String empname=n.getEname("rajesh");
		String stuname=n.getSname("kanna");
		String prodname=n.getPname("mobile");
		System.out.println("employee name:::"+empname);
		System.out.println("student  name:::"+stuname);
		System.out.println("product name:::"+prodname);
	Age a=new Age();
	int empage=a.getEage(22);
	int stuage=a.getSage(23);
	System.out.println("employee age:::"+empage);
	System.out.println("Student age:::"+stuage);
	
	Phno P=new Phno();
	int emphno=P.getEphno(987484758);
	int stuphno=P.getSphno(874584758);
	System.out.println("employee phno:::"+emphno);
	System.out.println("Student phno:::"+stuphno);
	
	}

}
