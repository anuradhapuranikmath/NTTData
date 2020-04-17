package com.nttdata.Ioc.constructor;

public class Demo {

	private  String message;
	
	/*public Demo(String message)
	{
		this.message=message;
	}
	*/
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void print()
	{
		System.out.println(" Hello  "+message );
	}
}
