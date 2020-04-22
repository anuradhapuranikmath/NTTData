package com.nttdata.oops.abstraction;

public class Mobile extends ElectronicDevice {

	@Override
	public void on() {
		System.out.println("Mobile Started ");
	}

	@Override
	public void off() {
		System.out.println(" Mobile Switched Off");
	}

	public void authenticate()
	{
		System.out.println(" Yes authentication done");
	}
}
