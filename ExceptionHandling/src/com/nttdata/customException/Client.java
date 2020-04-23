package com.nttdata.customException;

public class Client {
	public static void main(String[] args) {
		// Setting values for User 1 
       Account account1=new Account();
       account1.setAccountId(12);
       account1.setAmount(10000);
		User user1=new User();
		user1.setUserName("Anuradha");
		user1.setAccount(account1);
		// Setting  values for User 2
		Account account2=new Account();
		account2.setAccountId(32);
		account2.setAmount(5000);
		User user2 =new User ();
		user2.setUserName("Preeti");
		user2.setAccount(account2);
		
		System.out.println(" Before Transaction details of 2 Users as below");
		System.out.println(" User1 Name: "+user1.getUserName()+"\t"+"Account ID "+user1.getAccount().getAccountId()+"\t"+"User1 Account amount "+user1.getAccount().getAmount());
		System.out.println(" User2 Name: "+user2.getUserName()+"\t"+"Account ID "+user2.getAccount().getAccountId()+"\t"+"User2 Account amount "+user2.getAccount().getAmount());
		Bank bank =new Bank();
		try {
			bank.transferFunds(user1, user2, 5000);
		} catch (InsufficientAmount e) {
			
			e.printStackTrace();
		}
		System.out.println("__________________________________________________________________________________________");
		System.out.println(" After Transaction Both Users Deatils");
		System.out.println(" User1 Name: "+user1.getUserName()+"\t"+"Account ID "+user1.getAccount().getAccountId()+"\t"+"User1 Account amount  "+user1.getAccount().getAmount());
		System.out.println(" User2 Name: "+user2.getUserName()+"\t"+"Account ID "+user2.getAccount().getAccountId()+"\t"+"User2 Account amount  "+user2.getAccount().getAmount());
	}
}
