package com.nttdata.CreationalDesginPattern.FactoryExample;

public class VehicleFactory {

	
	public Vechicle getVehicleFcatory(String s)

{
		if(s.equalsIgnoreCase("bus"))
		{
			return new Bus();
		}
		else if(s.equalsIgnoreCase("car"))
		{
			return new Car();
		}
		
		else
		{
			return null;
		}
}
}
