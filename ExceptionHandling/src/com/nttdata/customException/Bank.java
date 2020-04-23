package com.nttdata.customException;

public class Bank {

	void transferFunds(User user1,User user2,double amount) throws InsufficientAmount
	{
		if (user1.getAccount().getAmount()<5000)
		{
			throw new InsufficientAmount(" You Have Insufficient Amount in your Account !!!!! please check before Tranfer");
		}
		else
		{
			double user1amt=   user1.getAccount().getAmount();
			double amtu1=user1amt-5000;
			user1.getAccount().setAmount(amtu1);
			
			double user2amt=user2.getAccount().getAmount();
			double amtu2=user2amt+5000;
			user2.getAccount().setAmount(amtu2);
		}
	}
	
}
