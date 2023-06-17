package ioStreams;
import java.io.*;
public class FIS_Demo {

	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream("F:\\raj\\two.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int ch;
		while((ch=bis.read())!=-1) {
			System.out.println((char)ch);
		}
bis.close();
	}

}
