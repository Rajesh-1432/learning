package ioStreams;
import java.io.*;
public class FileCreation_Demo {

	public static void main(String[] args)throws IOException {
		File f=new File("F:\\raj\\raj1.text");
		f.createNewFile();
		if(f.exists()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File is doesn't exists");
		}

	}

}
