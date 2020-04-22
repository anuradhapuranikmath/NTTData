package com.nttdata.Dao;

import java.util.List;

import com.nttdata.Model.Employee;

public interface EmployeeDao {
	List<Employee> getEmployees();
 boolean deleteEmployee(int id); 
	
}
