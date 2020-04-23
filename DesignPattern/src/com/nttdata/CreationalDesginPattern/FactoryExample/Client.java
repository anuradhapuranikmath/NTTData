package com.nttdata.CreationalDesginPattern.FactoryExample;

import java.util.Scanner;

public class Client {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println(" Enter the Vechile Name from given List ");
	System.out.println("1. Car  \t  2. Bus ");
	String input=scanner.next();
	
	VehicleFactory v=new VehicleFactory();
	Vechicle v1=v.getVehicleFcatory(input);
	v1.run();
	
}
}
