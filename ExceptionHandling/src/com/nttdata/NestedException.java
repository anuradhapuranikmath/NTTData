package com.nttdata;

public class NestedException {
public static void main(String[] args) {
	
	try{
		
		try{
			
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		try{
			 int i=10/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println(" out side try block");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally{
		System.out.println(" i am always exceuting");
	}
}
}
