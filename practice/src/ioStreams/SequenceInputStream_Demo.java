package ioStreams;
import java.util.Scanner;
import java.io.*;
public class SequenceInputStream_Demo {

	public static void main(String[] args)throws IOException {
		
		// to fetch many files content\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st file name");
		String f1=sc.next();
	FileInputStream fis=new FileInputStream("F:\\raj\\"+f1);
	System.out.println("Enter 2nd file name");
	String f2=sc.next();
	FileInputStream fis1=new FileInputStream("F:\\raj\\"+f2);
	System.out.println("Enter 3rd file name");
	String f3=sc.next();
	FileInputStream fis2=new FileInputStream("F:\\raj\\"+f3);
	
	FileOutputStream fout=new FileOutputStream("F:\\raj\\Append.text");
//to concate(To Append)
	SequenceInputStream sq1= new SequenceInputStream(fis,fis1);
	SequenceInputStream sq2= new SequenceInputStream(sq1,fis2);
	int ch;
	sq2.skip(5);
	while((ch=sq2.read())!=-1) {
		fout.write((char)ch);
	}
	sq2.close();
	fout.close();
	System.out.println("Append of 3 files content");
	System.out.println("Please check in <<Append.text>> file in your folder");
	
	}

}
