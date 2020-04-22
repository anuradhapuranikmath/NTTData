package com.nttdata.oops.polymorphsim;

public class Area {

	void area(int length)
	{
		System.out.println(" Area Of Square"+length* length);
	}
	
	void area(int length,int breadth)
	{
		System.out.println(" Rectangle Area is "+length* breadth);
		
	}
	
	double area(int length,double heigth,int breadth)
	{
		return length*breadth*heigth;
	}
}
