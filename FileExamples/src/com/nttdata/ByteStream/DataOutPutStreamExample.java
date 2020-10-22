package com.nttdata.ByteStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutStreamExample {

	void writeData()
	{
		DataOutputStream dout;
		try {
			dout = new DataOutputStream(new FileOutputStream("Test.txt"));
			dout.writeInt(77);
			dout.writeDouble(29.7);
			dout.writeBoolean(false);
			dout.writeChar('6');
			dout.writeLong(78900);
			System.out.println(" data written success");
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	void readData()
	{
		try {
			DataInputStream din=new DataInputStream(new FileInputStream("Test.txt"));
			int a=din.readInt();
			double b=din.readDouble();
			boolean c=din.readBoolean();
			char d=din.readChar();
			long e=din.readLong();
			System.out.println("Values read from File are :"+ a +" \t "+b+"\t"+c+"\t"+d+"\t"+e );
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		DataOutPutStreamExample d=new DataOutPutStreamExample();
		//d.writeData();
		d.readData();
		
	}
	
}
