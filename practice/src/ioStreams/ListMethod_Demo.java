package ioStreams;
import java.io.*;
public class ListMethod_Demo {
		public static void main (String args[])throws IOException {
			File f1=new File("f:\\raj\\");
			String []str=f1.list();
			for(int i=0;i<str.length;i++) {
				File f2=new File(f1,str[i]);
				//if(f2.isFile())
				if(f2.isDirectory()){
					System.out.println(str[i]);
				}
			//	System.out.println(str[i]);
				
			}
		}
}
