package com.nttdata;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
	public static void main(String[] args) {
		
	
	LocalDate date = LocalDate.now();
	 System.out.println(date);
	 int dd = date.getDayOfMonth();
	 int mm = date.getMonthValue();
	 int yy = date.getYear();
	 System.out.println(dd+"..."+mm+"..."+yy);
	System.out.printf("\n%d-%d-%d",dd,mm,yy);
	
	//zone 
	
	ZoneId zoneid=ZoneId.systemDefault();
	System.out.println(zoneid);
	
	//creating specific Zone id 
	ZoneId la=ZoneId.of("America/Los_Angeles");
	ZonedDateTime z=ZonedDateTime.now(la);
	System.out.println(z);
	
}
	
}
