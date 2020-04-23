package com.nttdata.StructuralDesignPatter.AdpaterPattern;

public class AdpaterPatternDemo {
public static void main(String[] args) {
	
	CreditCard  c=new BankCustomer();
	c.givenBankDetails();
	System.out.println(c.getCreditCrad());
	
}
}
