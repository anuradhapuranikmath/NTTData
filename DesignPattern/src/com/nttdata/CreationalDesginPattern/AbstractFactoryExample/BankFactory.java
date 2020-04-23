package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank ) {
		if (bank.equalsIgnoreCase("ICICI"))
		{
			return new ICICI();
		}
		
		else if(bank.equalsIgnoreCase("Axis"))
		{
			return new Axis();
		}
		else 
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		
		return null;
	}

}
