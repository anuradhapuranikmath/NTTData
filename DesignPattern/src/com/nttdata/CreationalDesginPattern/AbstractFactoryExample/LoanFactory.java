package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan.equalsIgnoreCase("HomeLoan"))
		{
			return new HomeLoan();
		}
		else if(loan.equalsIgnoreCase("EducationalLoan"))
		{
			return new EducationalLoan();
		}
		else
		return null;
	}

}
