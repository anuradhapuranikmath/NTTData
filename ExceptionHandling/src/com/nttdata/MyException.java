package com.nttdata;

import java.io.IOException;

public class MyException {

	
		public String foo(){
			String s=null;
		try{
	              
	             s.length();
	             return s;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
		}
		public static void main(String[] args) {
			MyException exception=new MyException();
			exception.foo();
		}
	}
