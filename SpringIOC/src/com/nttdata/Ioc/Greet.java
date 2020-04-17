package com.nttdata.Ioc;

public class Greet {

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show()
	{
		System.out.println(message);
	}
}
