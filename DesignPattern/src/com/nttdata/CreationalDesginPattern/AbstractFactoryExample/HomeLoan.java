

package com.nttdata.CreationalDesginPattern.AbstractFactoryExample;

public class HomeLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate=r;
		
	}

}
