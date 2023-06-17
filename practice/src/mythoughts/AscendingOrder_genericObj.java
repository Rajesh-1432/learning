package mythoughts;

import java.util.*;

class Student{
	int sid;
	String sname;
	int age;
	public Student(int sid,String sname,int age) {
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		
	}
}
class age implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student str1=(Student)o1;
		Student str2=(Student)o2;
		if(str1.age<str2.age) {
			return +1;
		}
		else if(str1.age>str2.age) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
public class AscendingOrder_genericObj {

	public static void main(String[] args) {
		List<Student>l=new ArrayList<>();
		l.add(new Student(101, "Rajesh", 23));
		l.add(new Student(102, "kanna", 17));
		l.add(new Student(104, "bujji", 24));

		Collections.sort(l,new age());
		for(Student s1:l) {
			System.out.println(s1.sid+"::"+s1.sname+"::"+s1.age);
		}
	}

}
