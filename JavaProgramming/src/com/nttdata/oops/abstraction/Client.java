package com.nttdata.oops.abstraction;

public class Client {
public static void main(String[] args) {
	
	ElectronicDevice electronicDevice=new Mobile();//upcasting
	electronicDevice.on();
	electronicDevice.onStartmessage();
	electronicDevice.off();
}
}
