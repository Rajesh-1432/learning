package ioStreams;
import java.io.*;
public class FileCreation_Demo2 {

	public static void main(String[] args) throws IOException {
		//File f1=new File("F:\\raj\\","two.txt");
		//f1.createNewFile();
		FileOutputStream fos=new FileOutputStream("F:\\raj\\bujji.txt");
		System.out.println("File is Created");
		DataInputStream dis=new DataInputStream(System.in); 
		System.out.println("Enter a data u want to exit you should go @");
		int ch;
		while((ch=dis.read())!='@') {
			fos.write((char)ch);
		}
		fos.close();
System.out.println("Written the data");
System.out.println("Please check the two.txt file");
	}

}
