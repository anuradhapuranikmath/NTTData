package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class Axis implements Bank{
private final String bankName;

public Axis() {
bankName="Axis";
}
	@Override
	public String getBankName() {
		return bankName;
	}

}
