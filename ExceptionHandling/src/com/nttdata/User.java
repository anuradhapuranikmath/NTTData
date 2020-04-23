package com.nttdata;

public class User {

	
	 void validateElectionAge(int age)throws Exception
	 {
		 if(age<18)
		 {
			 throw new NullPointerException("Age is too small to vote");
			 
		 }
		 else
		 {
			 System.out.println(" Ok fine you can go for voting");
		 }
	 }
}
