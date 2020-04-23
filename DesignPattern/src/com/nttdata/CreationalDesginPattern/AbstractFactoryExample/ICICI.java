package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class ICICI  implements Bank{
private final String bankName;
public ICICI() {
	bankName="ICICI";
}
	@Override
	public String getBankName() {
		return bankName;
	}

}
