package com.nttdata.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
	
	public static void main(String[] args) {
		
		Employee employee =new Employee(12, "Anu", 20,500);
		String fileName="Object.txt";
		try {
			FileOutputStream fout=new FileOutputStream(fileName);
			
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(employee);
			out.close();
			fout.close();
			System.out.println("Object has been serialized \n  "+"Data before Deserialization");
			employee.print(employee);
		
		} catch ( IOException e) {
		
			e.printStackTrace();
		}
		
		employee=null;// start Deserialization"
		
		FileInputStream fin;
		try {
			fin = new FileInputStream(fileName);
			ObjectInputStream in=new ObjectInputStream(fin);
			employee=(Employee)in.readObject();
			in.close();
			fin.close();
			System.out.println(" Object has been Deserialization");
			employee.print(employee);
		} catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
