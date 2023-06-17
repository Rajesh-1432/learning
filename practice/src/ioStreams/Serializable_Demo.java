package ioStreams;
import java.io.*;

class Employeee implements Serializable{
	transient final  int eid;
	String ename;
	double esal;
	public Employeee(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
}
public class Serializable_Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//*Serialization code
		FileOutputStream fout=new FileOutputStream("F:\\raj\\Serializable_Demo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(new Employeee(101, "Raj", 120000));
		//oos.writeObject(new Employeee(101, "Rajesh", 120000));
		//upto here
		//De-Serialization
		FileInputStream fis=new FileInputStream("F:\\raj\\Serializable_Demo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employeee e=(Employeee)ois.readObject();
				System.out.println(e.eid+"::"+e.ename+"::"+e.esal);
		oos.close();
		ois.close();
	}

}
