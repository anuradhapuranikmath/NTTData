package com.nttdata.Collection;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmployeeName().compareTo(e2.getEmployeeName());
	}

}
