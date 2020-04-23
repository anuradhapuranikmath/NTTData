package com.nttdata.CreationalDesginPattern.PrototypePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
    System.out.print("Enter Student Id: ");  
    int sid=Integer.parseInt(br.readLine());  
    System.out.print("\n");  
      
    System.out.print("Enter Student Name: ");  
    String sname=br.readLine();  
    System.out.print("\n");  
      
      
    System.out.print("Enter Student Address: ");  
    String saddress=br.readLine();  
    System.out.print("\n");  
      
   Student student=new Student(sid, sname, saddress);
   student.showDetails();
   
   Student student1=(Student)student.getClone();
    student1.showDetails();
}
}
