package com.nttdata.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {
	
	void writeToFile()
	{

		try {
			FileOutputStream out=new FileOutputStream("C:/Users/203594/Documents/Java Training/io/abc.txt");
			out.write(67);
             out.close();
             System.out.println(" file is written ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	void readFromFile()
	{
		try {
			FileInputStream in=new FileInputStream("C:/Users/203594/Documents/Java Training/io/abc.txt");
		  int i=in.read();
		  System.out.println((char)i);
		} catch ( IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		FileOutPutStreamExample f=new FileOutPutStreamExample();
		//f.writeToFile();
		f.readFromFile();
	}

}
