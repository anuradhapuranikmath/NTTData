package com.nttdata.ChracterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	void writeToFile()
	{
		try {
			FileWriter w=new FileWriter("C:/Users/203594/Documents/Java Training/io/Chracter/abc.txt");
			w.write(" Hi This is java class");
			w.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	void readFromFile()
	{
		try {
			FileReader fr=new FileReader("C:/Users/203594/Documents/Java Training/io/Chracter/abc.txt");
			int i;
			while((i=fr.read())!=-1)
			 {
				System.out.print((char)i); 
			 }
			 fr.close();
		} catch ( IOException e) {


			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	
	FileWriterExample f=new FileWriterExample();
	//f.writeToFile();
	f.readFromFile();
}
}
