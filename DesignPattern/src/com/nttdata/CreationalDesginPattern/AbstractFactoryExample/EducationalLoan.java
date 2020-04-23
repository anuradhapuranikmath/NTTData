package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class EducationalLoan  extends Loan{

	@Override
	void getInterestRate(double r) {
		rate=r;
		
	}

}
