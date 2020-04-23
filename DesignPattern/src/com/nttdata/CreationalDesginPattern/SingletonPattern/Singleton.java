package com.nttdata.CreationalDesginPattern.SingletonPattern;

public class Singleton {
	
	private static Singleton singleton=new Singleton();
	private Singleton()
	{}
	public static Singleton getInstance()
	{
		return singleton;
	}
	
	
	public void foo()
	{
		System.out.println("Hello Welcome to Singleton class");
	}
	
}
