package com.nttdata.oops;

public class Customer extends  User {
	
	private int customerId;
	private double bill;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double getBill()
	{
		return bill;
	}
	 public void  customerBill()
	 {
		 System.out.println(" Hi User with User ID "+customerId+" has bill  "+bill);
	 }

}
