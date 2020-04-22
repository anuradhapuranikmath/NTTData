package com.nttdata.oops;

public class User  extends Humans{

	 private String userName;
	 private String userAddress;
	 
	 public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public void welcomeUser()
	 {
		 System.out.println(" Hi welcome "+ userName +"to Our Shopping");
	 }
	
}
