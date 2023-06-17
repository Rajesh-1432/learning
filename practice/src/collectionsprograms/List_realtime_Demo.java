package collectionsprograms;
import java.util.*;
class Emp01{
	int eid;
	String ename;
	double esal;
	public Emp01(int eid,String ename,double esal) {
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	
	}
}
public class List_realtime_Demo {
	static Scanner sc;
	static List<Emp01>l;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.store emp obj");
			System.out.println("2.view details");
			System.out.println("3.add details");
			System.out.println("4.delete details");
			System.out.println("5.exit");
			System.out.println("Enter ur choice");
			int k = sc.nextInt();
			switch (k) {
			case 1:
				l=new ArrayList();
				System.out.println("Enter how records are u needed to insert::");
				int n1=sc.nextInt();
				for(int i=0;i<n1;i++) {
					System.out.println("Enter eid::");
					int id=sc.nextInt();
					System.out.println("Enter ename::");
					String name=sc.next();
					System.out.println("Enter salary::");
					double sal=sc.nextDouble();
					l.add(new Emp01(id, name, sal));
				}
				break;
			case 2:
				
				l.forEach(x->{
					Emp01 e=(Emp01)x;
					System.out.println(e.eid+"::"+e.ename+"::"+e.esal);
				});
				
				
				break;
			case 3:
				System.out.println("Enter eid::");
				int id=sc.nextInt();
				System.out.println("Enter ename::");
				String name=sc.next();
				System.out.println("Enter salary::");
				double sal=sc.nextDouble();
				System.out.println("Enter the position you need");
				int position=sc.nextInt();
				l.add(position,new Emp01(id, name, sal));
	
				break;
			case 4:
				System.out.println("Enter the position you need");
				int p1=sc.nextInt();
				l.remove(p1);
				break;
			case 5:
	            System.exit(0);
				break;

			default:
System.out.println("invalid choice::");
				break;
			}
		}

	}

}
