package com.nttdata.Collection;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	if(e1.getEmployeeId()>e2.getEmployeeId())
	{
		return 1;
	}
	else if(e1.getEmployeeId()<e2.getEmployeeId())
	{
		return -1;
	}
		return 0;
	}

}
