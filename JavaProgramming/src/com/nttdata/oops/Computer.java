package com.nttdata.oops;

public class Computer {

	private String  brandName;
	private double cost;
	private String color;
MotherBoard motherBoard;
	
	public String getBrandName() {
	return brandName;
}

public void setBrandName(String brandName) {
	this.brandName = brandName;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public MotherBoard getMotherBoard() {
	return motherBoard;
}

public void setMotherBoard(MotherBoard motherBoard) {
	this.motherBoard = motherBoard;
}

	public void displayComputerDetails()
	{
		System.out.println(" The configuartion of computer is as below");
		System.out.println(" Name is "+brandName+"Cost is "+cost+"Color is "+color +" Mother Board has detials  Ram "+motherBoard.ram.getRamSize()+" Hard disk is "+motherBoard.getHardDisk());
	}
}
