package com.nttdata.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * Thi is file example with an issuse  solved 
	 */
	private static final long serialVersionUID = 1L;
	
	transient int a;
	static int b;
	String name;
	int age;
	public Employee(int a, String name, int age,int b) {
		super();
		this.a = a;
		this.name = name;
		this.age = age;
		this.b=b;
	}
	 void print(Employee e)
	 {
		 System.out.println("Transient Value "+e.a +" \t"+" Name is:"+e.name+" \t"+"Age is "+e.age+" static "
		 		+ "value b"+e.b);
	 }
}
