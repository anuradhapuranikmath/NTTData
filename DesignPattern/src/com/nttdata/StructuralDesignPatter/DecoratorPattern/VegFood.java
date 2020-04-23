package com.nttdata.StructuralDesignPatter.DecoratorPattern;

public class VegFood implements Food{

	@Override
	public String prepareFood() {
		
		return "veg food";
	}

	@Override
	public double foodprice() {
		System.out.println(" insode ved food");
		return 80.4;
	}

}
