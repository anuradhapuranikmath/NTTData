package com.nttdata.StructuralDesignPatter.DecoratorPattern;

public class FoodDecorator implements Food{
private Food newFood;

public FoodDecorator(Food newFood)
{
	this.newFood=newFood;
}

@Override
public String prepareFood() {
	
	return newFood.prepareFood();
}

@Override
public double foodprice() {
	System.out.println("inside food decorator");
	return newFood.foodprice();
}


}
