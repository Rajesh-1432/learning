package collections_Practice;

import java.util.*;
class Stud{
	int sid;
	String sname;
	int sage;
	public Stud(int sid,String sname,int sage) {
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
	}

}

public class List_ArrayList_Demo {

	public static void main(String[] args) {
		
		/*Collection A=new ArrayList();
		A.add("Rajesh");
		A.add('k');
		A.add(6);
		A.add(true);
		A.add(10.32);
		A.remove(6);
		System.out.println(A);
		for(Object i:A) {
			System.out.println(i);
		}
		
		Collection M=new ArrayList();
		M.add(10);
		M.add("Rajesh");
		M.add(30);
		for(Object o:M) {
			System.out.println(o);
			
		}*/
		List a=new ArrayList();
		a.add(10);
		a.add("Rajesh");
		a.add(30);
		for(Object o:a) {
			System.out.println(o);
			
		}/*
		List<Integer> l1=new ArrayList<>();
		List<String> l2=new ArrayList<>();
		List<Double> l3=new ArrayList<>();
		List<Float> l4=new ArrayList<>();
		List<Char> l5=new ArrayList<>();
		List<Byte> l6=new ArrayList<>();
		l1.add(30);
		l1.add(9);
		l1.add(20);
		l1.add(30);
		l1.add(9);
		l1.add(20);
		for(Integer o:l1) {
			System.out.println(o);
		}
		List<Stud>l2=new ArrayList<>();
		l2.add(new Stud(14,"Rajesh" ,23));
		l2.add(new Stud(32, "Aparna", 23));
		l2.add(new Stud(52, "Sivani", 23));
		l2.add(new Stud(58, "Satya", 22));
		
		for(Stud o:l) {
			System.out.println(o.sid+"::"+o.sname+"::"+o.sage);
			
		}
		l2.forEach(x->{
			Stud o=(Stud)x;
			System.out.println(o.sid+"::"+o.sname+"::"+o.sage);
		});*/
		
		
	}

}


