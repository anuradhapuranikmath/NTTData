package com.nttdata;

import java.util.Scanner;

public class Client {
public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in) ;
	 System.out.println(" enter teh ID ");
	 int id=scanner.nextInt();
	System.out.println(" enter the Name");
	String name=scanner.next();
	System.out.println(" eneter the salary");
    double slalary=scanner.nextDouble();
    Employee employee=new Employee(id,name,slalary);
    
   
   employee.displayEmployee();
   
   
   
   
}
}
