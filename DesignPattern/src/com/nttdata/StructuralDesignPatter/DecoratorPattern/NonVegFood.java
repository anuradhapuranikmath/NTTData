package com.nttdata.StructuralDesignPatter.DecoratorPattern;

public class NonVegFood extends FoodDecorator{    
    public NonVegFood(Food newFood) {  
        super(newFood);  
    }  
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodprice()   {  
    	System.out.println("inside non veg food class");
    	double d=super.foodprice();
    	System.out.println(d);
        return d+100;
    }  
}  