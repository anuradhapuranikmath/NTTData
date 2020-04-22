package com.nttdata.oops;

public class Client {
public static void main(String[] args) {
	/*
	Customer user=new Customer();
	user.setUserName("Anuradha");
	user.setCustomerId(789);
	user.greet();
	user.welcomeUser();
	user.setBill(677);
	user.customerBill();*/
	
	Computer computer =new Computer();
	Ram ram =new Ram();
	ram.setRamSize("4GB");
	 MotherBoard motherboard=new MotherBoard();
	 motherboard.setRam(ram);
     motherboard.setHardDisk("1TB");	
     computer.setBrandName("DELL");
     computer.setColor("Red");
     computer.setCost(70000);
     computer.setMotherBoard(motherboard);
     
     computer.displayComputerDetails();
	
}
}
