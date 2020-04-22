package com.nttdata;

public class LambaExample{
	
	public static void main(String[] args) {
		
		InterfaceA m=()->System.out.println(" hi this is functional interace with lambda expression");
		m.foo();
		
	      m.print(); // calling default method
	
	AdditionInterace res=(a,b)->System.out.println(" addtion of a and b is " +(a+b));
	res.add(20, 56);
	
	
	   
	 	}
}